package org.example.autowiring.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringByType {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowiringByType.xml");
        Car car= (Car) applicationContext.getBean("myCar");
        System.out.println(car);
    }
}
