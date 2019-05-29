package pl.com.bohdziewicz.tutorials.aop;

import java.util.logging.Logger;

public class SimpleBeanImpl implements SimpleBean {
    @Override public void doSomething() {
        Logger.getLogger(this.getClass().getName()).info("Działam");
    }
}
