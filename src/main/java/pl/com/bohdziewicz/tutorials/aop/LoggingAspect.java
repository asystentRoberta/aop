package pl.com.bohdziewicz.tutorials.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingAspect {
    public void logExecution() {
        LogManager.getLogger(getClass().getName()).info("Method executing");
    }
}
