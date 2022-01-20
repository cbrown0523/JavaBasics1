package com.careerdevs.car;

public class Car {
    public String makes;
    public String model;
    public int mileage;
    public float gasTankPercent;

    public Car( String makes , String model , int mileage, float gasTankPercent ){
        this.makes = makes;
        this.model = model;
        this.mileage = mileage;
        this.gasTankPercent = gasTankPercent;
    }

    public static void main(String[] args) {
        Car myCar = new Car("taurus" , "ford", 1452, 30);
        System.out.println("Make:" + " " + myCar.makes + " Model " + myCar.model + " " + "mileage " + " "+ myCar.mileage + " " + "gasTankPercent " + " " + myCar.gasTankPercent) ;

        Car myCar1 = new Car("mercury" , "saturn", 18852, 20);
        System.out.println("Make:" + " " + myCar1.makes + " Model " + myCar1.model + " " + "mileage " + " "+ myCar1.mileage + " " + "gasTankPercent " + " " + myCar1.gasTankPercent) ;

        Car myCar2 = new Car("intrepid" , "dodge", 188542, 70);
        System.out.println("Make:" + " " + myCar2.makes + " Model " + myCar2.model + " " + "mileage " + " "+ myCar2.mileage + " " + "gasTankPercent " + " " + myCar2.gasTankPercent) ;
    }
}
