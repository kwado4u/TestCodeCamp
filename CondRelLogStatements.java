package com.company;

public class CondRelLogStatements {
    public static void main(String[] args) {
        // conditional statements
        int myAge = 30;
        int myScore = 15;
        // false
        if(myAge == 30 && myAge <35 ) {
            System.out.println("it is equal for if");

            // true
        } else if(myAge >=30){
            System.out.println("it is equal for else if");

        } else {
            System.out.println("no true condition");
        }

    // ASSIGNMENT
        {
            int num = 15;
            {
                if (num / 3==0);
                    System.out.println("fizz");
            }

            {
                if (num / 5==0 );
                    System.out.println("buzz");
            }
            {
                if (num / 3 && 5 == 0);
                    System.out.println("fizzbuzz");
            }
        }




