package com.rashmi.polymorphism;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.animalSound();
        dog.animalSound();
    }
}
