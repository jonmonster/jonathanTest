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

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
        numbers.add(66);
        numbers.add(78);
        numbers.add(33);
        numbers.add(54);
        numbers.add(79);
        numbers.add(43);
        numbers.add(26);
        numbers.add(29);
        numbers.add(11);

        List<Integer> primeNumbers = new ArrayList<Integer>();

        JonathanUtil jonathanUtil = new JonathanUtil();
        primeNumbers = jonathanUtil.isPrime(numbers);

        for(Integer number : primeNumbers) {
            System.out.println("The number " + number + " is prime.");
        }
    }
}
