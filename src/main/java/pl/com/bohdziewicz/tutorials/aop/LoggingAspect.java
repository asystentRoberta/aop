package pl.com.bohdziewicz.tutorials.aop;

import org.aspectj.lang.JoinPoint;

public class LoggingAspect {

    public void logExecution(JoinPoint joinPoint) {

        System.out.println("Method :" + joinPoint.getSignature() + " is executing");
    }
}
