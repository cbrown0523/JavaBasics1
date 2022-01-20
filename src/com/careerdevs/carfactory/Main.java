package com.careerdevs.carfactory;

import java.util.Scanner;

public class Main {
    public static void createACar(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the make of your car");
        String make = scanner.nextLine();
        System.out.println("What is the model of your car");
        String model = scanner.nextLine();
        System.out.println("Who is the owner of your car");
        String owner = scanner.nextLine();


        System.out.println(owner + " owns the car " + model + " " + make);


    }
    public static void createACarObject() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the make of your car");
        String make = scanner.nextLine();
        System.out.println("What is the model of your car");
        String model = scanner.nextLine();
        System.out.println("Who is the mileage of your car");
        int mileage = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Who is the gas tank percentage of your car");
        float gasTankPercentage = scanner.nextFloat();

        Car myCar = new Car(make, model, mileage , gasTankPercentage );

       //System.out.println("You are driving a " + myCar.make + " " + myCar.model + " that has " + myCar.mileage + " miles and a gas tank with " + myCar.gasTankPercentage + " " + " percent of gas");
        System.out.println((myCar));
    }

    public static void main(String[] args) {

     createACar();
      createACarObject();
    }
}
