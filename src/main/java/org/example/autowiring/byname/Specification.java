package org.example.autowiring.byname;

public class Specification {
    private String model;
    private String type;

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
