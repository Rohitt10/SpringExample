package org.example.componentscan.byannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentScanByAnnotaion {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class );
        Employee employee = (Employee) applicationContext.getBean("employee");
        System.out.println(employee.toString());
    }
}
