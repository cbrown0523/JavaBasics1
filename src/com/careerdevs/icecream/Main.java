package com.careerdevs.icecream;

import java.util.Scanner;

public class Main {
    public static void makeIcecream(){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many scoops of icecream");
        int scoops = scan.nextInt();
        scan.nextLine();
        System.out.println("What flavor of icecream");
        String flavour = scan.nextLine();
        System.out.println("Would you like soft serve?");
        boolean isSoft = scan.nextBoolean();
        scan.nextLine();
        System.out.println("What color sprinkles? ");
        String sprinkle = scan.nextLine();

        Icecream  serveIcecream = new Icecream(scoops, flavour , isSoft , sprinkle);
        System.out.println(serveIcecream);
    }
    public static void main(String[] args) {
        makeIcecream();
    }

}

