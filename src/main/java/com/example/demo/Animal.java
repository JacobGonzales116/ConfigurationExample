package com.example.demo;

public class Animal {
    private String animalName;
    private String type;


    public Animal(String animalName, String type) {
        this.animalName = animalName;
        this.type = type;
    }

    public Animal() {
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
