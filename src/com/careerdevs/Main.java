package com.careerdevs;

public class Main {

    public static void main(String[] args) {
        String firstName = "Christine";
        String lastName = "Brown";
        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

        String name = createFullName(firstName , lastName);
        System.out.println(name);

    NameGenerator printName = new NameGenerator();
       System.out.println(printName.generateFullName("chrstine" , "brown"));
       //NameGenerator.generateFullName()

        Car myCar = new Car("taurus" , "ford", 1452, 30);
        System.out.println("Make:" + " " + myCar.makes + " Model " + myCar.model + " " + "mileage " + " "+ myCar.mileage + " " + "gasTankPercent " + " " + myCar.gasTankPercent) ;

        Car myCar1 = new Car("mercury" , "saturn", 18852, 20);
        System.out.println("Make:" + " " + myCar1.makes + " Model " + myCar1.model + " " + "mileage " + " "+ myCar1.mileage + " " + "gasTankPercent " + " " + myCar1.gasTankPercent) ;

        Car myCar2 = new Car("intrepid" , "dodge", 188542, 70);
        System.out.println("Make:" + " " + myCar2.makes + " Model " + myCar2.model + " " + "mileage " + " "+ myCar2.mileage + " " + "gasTankPercent " + " " + myCar2.gasTankPercent) ;




    }
    public static String createFullName(String first , String last){
       return  first + " " + last;

    }
}
