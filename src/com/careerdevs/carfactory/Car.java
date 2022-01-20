package com.careerdevs.carfactory;

import java.util.Scanner;

public class Car {
    //may these variables be local?
    public String make;
    public String model;
    public int mileage;
    public float gasTankPercentage;


    //  a constructor always create new instances and return
    public Car(String make, String model, int mileage, float gasTankPercentage) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.gasTankPercentage = gasTankPercentage;

    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                ", gasTankPercentage=" + gasTankPercentage +
                '}';
    }
}
