package org.example.cars;

public class MyCar {
    private final Specification specification;

    public MyCar(Specification specification) {
        this.specification = specification;
    }

    @Override
    public String toString() {
        return "MyCar{" +
                "specification=" + specification.toString() +
                '}';
    }
}
