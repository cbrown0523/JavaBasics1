package com.careerdevs.schoolsubjects;

import java.util.Scanner;

public class Main {
    public static void highschoolSub(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your first period school subject");
        String subject = scan.nextLine();
        System.out.println("What numeral grade did you receive?");
        int grade = scan.nextInt();
        System.out.println("was this your favorite class?");
        boolean isFav = scan.nextBoolean();

        SchoolSubject endSchoolSubject = new SchoolSubject(subject, grade, isFav);
        System.out.println(endSchoolSubject);
    }
    public static void main(String[] args) {
        highschoolSub();

    }
}
