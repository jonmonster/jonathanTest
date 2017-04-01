package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

      /*
       * Transforms a list of numbers where the output list is:
       *   a) of equivalent length, where each of those numbers
       *   b) is the product of all the numbers in the input, EXCEPT
       *   c) the number at the corresponding index, AND
       *   d) division is not used
       *
       * For example, given this input:
       *   [1,2,3,4,5]
       * Generates this output:
       *   [120,60,40,30,24]
       *   [2*3*4*5, 1*3*4*5,
       *
      */

        JonathanUtil jonathanUtil = new JonathanUtil();
        String str = "Zelda is a really fun game";
        List<String> suffixes = jonathanUtil.generateSuffixTree(str);

        //OOP- abstraction, encapsulation, polymorphism, inheritence


        System.out.println(suffixes);
    }
}
