package com.rashmi.oops_basics;

public class Car {
    String brand;
    String model;
    String engine;
    double mileage;

    Car (String brand, String model, String engine, double mileage) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.mileage = mileage;
    }

    void details() {
        System.out.println(this.brand + " " + this.model);
        System.out.println("Has " + this.engine);
        System.out.println("And a mileage of " + this.mileage);
    }
}
