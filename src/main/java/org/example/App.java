package org.example;

import org.example.cars.MyCar;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        MyCar myCar = (MyCar) context.getBean("myCar");
        System.out.println(myCar);
    }
}
