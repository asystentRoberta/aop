package pl.com.bohdziewicz.tutorials.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingAspect {
    private Logger logger = LogManager.getLogger(getClass().getName());

    public void logExecution() {

        logger.info("Method executing");
    }

    public void warnIfNull(Object returnedValue) {
        if (returnedValue == null) {
            logger.warn("Returned object was null");
        }
    }

    public void serveExceptions(RuntimeException exception) {
        logger.error("Exception: " + exception.getMessage());
    }
}
