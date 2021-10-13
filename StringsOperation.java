package com.company;

public class StringsOperation {
    public static void main(String[] args) {
       // String word = "orGANization";


        //  uppercase and lowercase
        //  System.out.println(word.toLowerCase());
       // System.out.println(word.toUpperCase());


        // length
        // System.out.println(word.length());

        //index of a character
        //System.out.println(word.indexOf("G"));

        //char at a particular index
        //System.out.println(word.substring(0, 5));

        //ASSIGNMENT
        String word = "DEMOCRACY";
        StringBuffer sb=new StringBuffer(word);
        System.out.println(sb.reverse());
        System.out.println(word.substring(4, 7));


    }