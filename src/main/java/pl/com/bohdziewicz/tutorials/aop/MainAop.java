package pl.com.bohdziewicz.tutorials.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAop {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        SomeBean someBean = context.getBean("someBean", SomeBean.class);
//        someBean.someMethod();
        try {
            someBean.throwException();
        } catch (RuntimeException e) {

        }
    }
}
