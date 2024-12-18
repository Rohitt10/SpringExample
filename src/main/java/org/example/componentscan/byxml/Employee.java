package org.example.componentscan.byxml;

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

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

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
