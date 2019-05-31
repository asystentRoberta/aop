package pl.com.bohdziewicz.tutorials.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BenchmarkAspect {

    private Logger logger = LogManager.getLogger(getClass().getName());

    public void measureExecutionTime() {

        long startTime = System.nanoTime();

        //here method is called

        long endTime = System.nanoTime();

        logger.info("Executin time = " + (endTime - startTime) + " ns.");
    }
}
