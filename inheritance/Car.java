package com.rashmi.inheritance;

public class Car extends Vehicle {
    double mileage;
    public Car(String brand, String model, double mileage) {
        super(brand, model);
        this.mileage = mileage;
    }
}
