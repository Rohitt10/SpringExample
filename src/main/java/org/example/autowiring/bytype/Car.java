package org.example.autowiring.bytype;

public class Car {
    Specification specification;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    @Override
    public String toString() {
        return "Car{" +
                "specification=" + specification +
                '}';
    }
}
