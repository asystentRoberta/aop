package pl.com.bohdziewicz.tutorials.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspectWithAnnotations {

    private Logger logger = LogManager.getLogger();

    @Pointcut("execution(* *(..))")
    public void allMethods() {

    }

    @Before("allMethods()")
    public void logBefore(JoinPoint joinPoint) {

        logger.info("Aspect(before) -> now I'm executing method: -> " + joinPoint.getSignature().getName());
    }

    @After("execution(* *(..))")
    private void logAfter(JoinPoint joinPoint) {

        logger.info("Aspect(after) -> after method: -> " + joinPoint.getSignature().getName());
    }

    @AfterReturning(pointcut = "allMethods()", returning = "returnedValue")
    private void afterReturning(Object returnedValue) {

        logger.info("Aspect(afterReturning) -> method returned: -> " + returnedValue);
    }

    @AfterThrowing(pointcut = "allMethods()", throwing = "exception")
    private void logAfterThrowing(JoinPoint joinPoint, Throwable exception) {

        logger.info("Aspect(afterThrowing) -> method -> " + joinPoint.getSignature().getName() + " -> has thrown -> "
                + exception);
    }

    @Around("allMethods()")
    private void logExecutionTome(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        long start = System.currentTimeMillis();
        proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();
        logger.info("Aspect(around) -> excution method: -> " + (end - start) + "ms.");
    }
}
