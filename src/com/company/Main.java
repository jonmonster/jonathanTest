package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /**
         * Assignment #1
         * Create a method that looks at the below lists (listOne and listTwo), and finds the numbers that exists in both of the lists
         * Add this method to the JonathanUtil class (I just added this class)
         * For example, both lists have the number 1 in them.  Your method should find the number 1.
         * Then print these numbers to the console
         */

        ArrayList<Integer> listOne = new ArrayList<Integer>();
        ArrayList<Integer> listTwo = new ArrayList<Integer>();

        listOne.add(1);
        listOne.add(1);
        listOne.add(3);
        listOne.add(4);
        listOne.add(6);
        listOne.add(23);
        listOne.add(56);
        listOne.add(47);
        listOne.add(38);
        listOne.add(96);
        listOne.add(54);
        listOne.add(53);
        listOne.add(11);
        listOne.add(77);

        listTwo.add(1);
        listTwo.add(65);
        listTwo.add(54);
        listTwo.add(78);
        listTwo.add(79);
        listTwo.add(96);
        listTwo.add(44);
        listTwo.add(32);
        listTwo.add(24);
        listTwo.add(21);

        JonathanUtil ju = new JonathanUtil();


        System.out.print("The duplicated numbers in the lists are.." + ju.findDuplicates(listOne, listTwo));
        System.out.print("\n");
        System.out.print("The duplicated numbers in the lists are.." + ju.findDupes2(listOne, listTwo));
    }
}
