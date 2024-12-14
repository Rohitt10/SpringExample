package org.example;

public class MyBean {
    public String message;
    public void display() {
        System.out.println("MyBean");
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "name='" + message + '\'' +
                '}';
    }
}
