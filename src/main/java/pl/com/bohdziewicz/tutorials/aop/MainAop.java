package pl.com.bohdziewicz.tutorials.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAop {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        CustomerRepository customer = context.getBean("customer", CustomerRepository.class);
        System.out.println(customer.getCustomerName(1L));
    }
}
