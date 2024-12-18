package org.example.autowiring.byconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringByConstructor {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowireByConstructor.xml");
        Car car= (Car) applicationContext.getBean("myCar");
        System.out.println(car);
    }
}
