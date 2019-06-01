package pl.com.bohdziewicz.tutorials.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAop {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        SomeBean someBean = context.getBean("someBean", SomeBean.class);
        AnotherBean anotherBean = context.getBean("anotherBean", AnotherBean.class);

        someBean.setAnotherThing(null);
        someBean.setSomething(null);
        someBean.getSomething();
        someBean.anotherMethod();

        anotherBean.anotherMethod();
        anotherBean.getSomething();
        anotherBean.setAnotherThing(null);
        anotherBean.setAnotherThing(null);
    }
}
