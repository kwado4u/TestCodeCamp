package com.company;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String userInput = "";

    while(true) {

        if (!userInput.equalsIgnoreCase("testify")) {
            System.out.println("write testify" );
            userInput = scanner.nextLine();
            continue;
        } else if (userInput.equalsIgnoreCase("testify")) {
            System.out.println("you are out");
            break;
        }
        System.out.println("try again");
    }
    }}