package org.example.componentscan.byxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentScanByXML {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("componentScanByXml.xml");
        Employee employee = (Employee) applicationContext.getBean("employee");
        System.out.println(employee.toString());
    }
}
