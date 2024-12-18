package org.example.autowiring.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringByName {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowiringByName.xml");
        Car car= (Car) applicationContext.getBean("myCar");
        System.out.println(car);
    }
}
