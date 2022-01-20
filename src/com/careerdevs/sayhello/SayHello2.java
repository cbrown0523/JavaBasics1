package com.careerdevs.sayhello;

import java.util.Scanner;

public class SayHello2 {

    public static void whatIsYourName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name");
        String name = scanner.next();
        System.out.println("Hello," + " " + name + " nice to meet you");

    }
        public static void whatIsYourFullName () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("What is your first name");
            String fName = scanner.next();
            System.out.println("What is your last name");
            String lName = scanner.next();
            System.out.println("It is so nice to formally meet you " + fName + " " + lName);

        }
    public static void whereBorn () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What city were you born in");
        String city = scanner.next();
        System.out.println(city + " what a beautiful city!");
        System.out.println("What year were you born in");
        int year = scanner.nextInt();
        System.out.println(year + " " + " was a great year");

    }

    public static void favNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your favorite number");
        int num = scanner.nextInt();
        System.out.println(num + ' ' + "is your lucky number!");

    }

        public static void main (String[]args){
            whatIsYourName();
            whatIsYourFullName();
            whereBorn();
            favNum();


        }

    }

