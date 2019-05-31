package pl.com.bohdziewicz.tutorials.aop;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Customer {

    private String name;

    @Override public String toString() {

        return "Customer{" +
                "name='" + name + '\'' +
                '}';
    }
}
