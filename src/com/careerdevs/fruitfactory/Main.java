package com.careerdevs.fruitfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        createFruit();
    }
    public static void createFruit(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the fruits id number");
        int idNum = scan.nextInt();
        scan.nextLine();

        System.out.println("What is the fruits name");
        String fruitName = scan.nextLine();

        System.out.println("Is the fruit ripe?");
        boolean isRipe = scan.nextBoolean();
        scan.nextLine();

        Fruit storeFruit = new Fruit(idNum, fruitName, isRipe );
        System.out.println(storeFruit);

    }

}
