package org.example.autowiring.byconstructor;

public class Car {
    Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }

    @Override
    public String toString() {
        return "Car{" +
                "specification=" + specification +
                '}';
    }
}
