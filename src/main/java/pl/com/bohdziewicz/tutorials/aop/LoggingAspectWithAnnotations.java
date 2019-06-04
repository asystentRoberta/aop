package pl.com.bohdziewicz.tutorials.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class LoggingAspectWithAnnotations {

    private Logger logger = LogManager.getLogger();

    public void logBefore(JoinPoint joinPoint) {

        logger.info("Executing method " + joinPoint.getSignature().getName());
    }

    private void logAfter(JoinPoint joinPoint) {

        logger.info("After method: " + joinPoint.getSignature().getName());
    }

    private void afterReturning(Object returnedValue) {

        logger.info("Method rerurned " + returnedValue);
    }

    private void logAfterThrowing(JoinPoint joinPoint, Throwable exception) {

        logger.info("Method " + joinPoint.getSignature().getName() + " has thrown " + exception);
    }
}
