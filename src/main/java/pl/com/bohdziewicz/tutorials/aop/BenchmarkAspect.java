package pl.com.bohdziewicz.tutorials.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;

public class BenchmarkAspect {

    private Logger logger = LogManager.getLogger(getClass().getName());

    public void measureExecutionTime(ProceedingJoinPoint proceedingJoinPoint) {

        long startTime = System.nanoTime();

        try {
            Customer customer = (Customer) proceedingJoinPoint.getArgs()[0];
            if (customer.getName() == null) {
                Object [] args = new Object[] {new Customer("anonim")}; //TODO: It is worth remembering
                proceedingJoinPoint.proceed(args);
            } else {
                proceedingJoinPoint.proceed();
            }

        } catch (Throwable throwable) {
            //TODO: Maybe at the ned of tutorial I will do something with that.
        }

        long endTime = System.nanoTime();

        logger.info("Executin time = " + (endTime - startTime) + " ns.");
    }
}
