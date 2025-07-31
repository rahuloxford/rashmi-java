package com.rashmi.static_keyword;

public class Human {
    String name;
    int age;
    double height;
    double weight;
    static long population;

    public Human(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        Human.population++;
    }
}
