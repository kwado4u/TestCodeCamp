package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaArrays {
    public static void main(String[] args) {
        int [] array1 = new int [9];
        array1[0] =10;
        array1[1] =1;
        array1[2] =4;
        array1[3] =2;
        //System.out.println(Arrays.toString(array1));

        String [] fruits = {"mango" ,"apple" ,"guava"};
      //  System.out.println(Arrays.toString(fruits));

        int [] [] doubleDimen = new int [2] [3];
        doubleDimen[0] [0] = 20;
        doubleDimen [0] [0] = 30;
        //System.out.println(Arrays.deepToString(doubleDimen));

        //ArrayList
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("test");
        arr.add("10");

        //arr.remove(1);
        System.out.println(arr.get(1));

        //ASSIGNMENT
    }
}
