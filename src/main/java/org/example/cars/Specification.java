package org.example.cars;

public class Specification {
    private String type;
    private String model;

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return "Specification type: " + type + " model: " + model;
    }
}
