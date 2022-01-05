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
       System.out.print(printName.generateFullName("chrstine" , "brown"));
       //NameGenerator.generateFullName()


    }
    public static String createFullName(String first , String last){
       return  first + " " + last;

    }
}
