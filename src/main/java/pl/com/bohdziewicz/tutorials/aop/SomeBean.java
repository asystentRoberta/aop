package pl.com.bohdziewicz.tutorials.aop;

import org.springframework.stereotype.Component;

@Component("someBean")
public class SomeBean {

    public String someMethod() {

        return "I'm returning tested value";
    }
}
