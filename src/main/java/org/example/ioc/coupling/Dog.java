package org.example.ioc.coupling;

public class Dog implements Animal {
    @Override
    public void speaks() {
        System.out.println("barks");
    }
}
