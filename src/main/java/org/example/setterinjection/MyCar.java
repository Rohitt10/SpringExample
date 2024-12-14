package org.example.setterinjection;

public class MyCar {
    private Specification specification;
    public Specification getSpecification() {
        return specification;
    }
    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    @Override
    public String toString() {
        return "MyCar{" +
                "specification=" + specification.toString() +
                '}';
    }
}
