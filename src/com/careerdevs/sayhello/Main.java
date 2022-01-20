package com.careerdevs.sayhello;

import com.careerdevs.NameGenerator;

public class Main {

    public static String createFullName(String first , String last){
        return  first + " " + last;
    }

    public static void main(String[] args) {
        String firstName = "Christine";
        String lastName = "Brown";
        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

        String name = createFullName(firstName , lastName);
        System.out.println(name);

    NameGenerator printName = new NameGenerator();
       System.out.println(printName.generateFullName("christine" , "brown"));






    }

}
