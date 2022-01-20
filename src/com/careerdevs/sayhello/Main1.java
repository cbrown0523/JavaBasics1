package com.careerdevs.sayhello;

import java.util.Scanner;

public class Main1 {
    public static void  whatIsYourName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name");
        String name = scanner.next();
        System.out.println("Hello," + " " + name + " nice to meet you");
    };

    public static void whatIsYourFullName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your first name");
        String fName = scanner.next();
        System.out.println("What is your last name");
        String lName = scanner.next();
        System.out.println("It is so nice to formally meet you " + fName + " " + lName);


    }

    public static void main(String[] args) {
        whatIsYourName();
        whatIsYourFullName();



    }

}
