package org.example.ioc.coupling;

public class Cat implements Animal {
    @Override
    public void speaks() {
        System.out.println("meowing");
    }
}
