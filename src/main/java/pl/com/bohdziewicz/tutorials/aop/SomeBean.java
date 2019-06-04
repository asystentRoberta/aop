package pl.com.bohdziewicz.tutorials.aop;

import org.springframework.stereotype.Component;

@Component
public class SomeBean {

    public String someMethod() {

        return "I'm returning tested value";
    }

    public void throwException() throws RuntimeException {
        throw new RuntimeException();
    }
}
