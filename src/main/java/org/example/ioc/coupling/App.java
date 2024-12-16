package org.example.ioc.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationCouplingIOC.xml");

//        Cat cat = new Cat();
//        Pet p1=new Pet(cat);
//        p1.react();
        Pet myPetCat= (Pet) applicationContext.getBean("myPetCat");
        myPetCat.react();


//        Dog dog = new Dog();
//        Pet p2=new Pet(dog);
//        p2.react();
        Pet myPetDog= (Pet) applicationContext.getBean("myPetDog");
        myPetDog.react();

    }
}
