package pl.com.bohdziewicz.tutorials.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
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
}
