package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /**
         * Assignment #1
         * Create a method that looks at the below lists (listOne and listTwo), and finds the numbers that exists in both of the lists
         * Add this method to the JonathanUtil class (I just added this class)
         * For example, both lists have the number 1 in them.  Your method should find the number 1.
         * Then print these numbers to the console
         */

        String[] a = new String[] {"ab", "lion", "x", "z", "house", "dog", "cat"};
        //Sorted {“x”, “z”, “ab”, “cat”, “dog”, “lion”, “house”}

        JonathanUtil jonathanUtil = new JonathanUtil();
        List<String> solution = jonathanUtil.sortArray(a);
        System.out.print(solution);
    }
}
