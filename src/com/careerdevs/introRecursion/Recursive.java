package com.careerdevs.introRecursion;

public class Recursive {

    public static int recursion(int countDownFrom) {
        if(countDownFrom < 0 ) {
            return 0;
        }
        else if (countDownFrom >= 0)
            System.out.println(countDownFrom);
        --countDownFrom;
         recursion(countDownFrom);
         return countDownFrom;
    }

    public static void main(String[] args) {
        //Recursive myRecursion = new Recursive();
       recursion(8);
    }
}