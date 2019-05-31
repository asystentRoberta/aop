package pl.com.bohdziewicz.tutorials.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAop {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        CustomerRepository customerRepository = context.getBean("customerRepository", CustomerRepository.class);
        Customer customer = new Customer("Franek");
        Customer customer1 = new Customer(null);

        customerRepository.addCustomer(customer);
        try {
            customerRepository.addCustomer(customer1);
        } catch (Exception e) {
            //for now do nothing

        }
    }
}
