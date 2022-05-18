package com.careerdevs.introRecursion;

public class Challenge {
        public static int sum(int n) {
            if(n < 0)
                return 0;
            else if(n==1)
                return 1;
            else
                return n+sum(n-1);

    }
}
