package com.careerdevs.asktheuser;

import java.util.Scanner;

public class UserInterface {

    public static void numByte(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Can you pick a number from 1 - 7 ?");
        byte luckNum = scan.nextByte();
        System.out.println("Your lucky number is " + luckNum);
        scan.nextLine();
    }
    public static void numShort(){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many inches tall are you");
        short inchTall = scan.nextShort();
        scan.nextLine();
        System.out.println(inchTall + " ?. Your are smaller than a giraffe");
    }
    public static void numInt(){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many people live in the United States?");
        int pplInUs = scan.nextInt();
        scan.nextLine();
        System.out.println(pplInUs + " So close. There are 4567897 people in the USA");
    }
    public static void numFloat(){
        Scanner scan = new Scanner(System.in);
        System.out.println("what is the number for pie");
        float pie = scan.nextFloat();
        scan.nextLine();
        System.out.println(pie + "? Ok, 3.14 represents pie");
    }
    public static void numLong(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Can you pick a number between -2,147,483,648 to 2,147,483,647 ?");
        double longNum = scan.nextLong();
        scan.nextLine();
        System.out.println("Great you picked a Java data type long number");
    }
    public static void getBool(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Is this q and a exciting for you?");
        boolean isFun = scan.nextBoolean();
        scan.nextLine();
        System.out.println(isFun + "?. fine");
    }
     public static void doubleNum(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Can you pick any number with fifteen decimal digits?");
        double doubleNum = scan.nextDouble();
        System.out.println("I cant imagine how many pennies that is");
    }
    public static void getStr(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String myStr = scan.next();
        System.out.println(myStr + " Thats all. Have a good day");
    }

    public static void main(String[] args) {
        numByte();
        numFloat();
        numInt();
        numLong();
        numShort();
        doubleNum();
        getStr();
        getBool();

}
}
