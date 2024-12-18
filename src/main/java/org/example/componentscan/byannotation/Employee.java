package org.example.componentscan.byannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {
    @Value("Rohit")
    private String name;

    @Value("#{10*2}")
    private int age;

    @Value("#{1*5}")
    private int id;

    @Value("${java.home}")
    private String slug;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", slug='" + slug + '\'' +
                '}';
    }
}
