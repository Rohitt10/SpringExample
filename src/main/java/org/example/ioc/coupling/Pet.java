package org.example.ioc.coupling;

public class Pet {
    private final Animal animal;

    public Pet(Animal animal) {
        this.animal = animal;
    }

    public void react(){
        animal.speaks();
    }

}
