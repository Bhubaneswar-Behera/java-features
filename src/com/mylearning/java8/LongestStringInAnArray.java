package com.mylearning.java8;

import java.util.Arrays;
import java.util.Comparator;

public class LongestStringInAnArray {
    public static void main(String[] args) {
        String[] stringArray = {"java","techie","springboot","microservices"};

        String longestString = Arrays.stream(stringArray)
                .reduce((word1,word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();

        System.out.println(longestString);


        //OR
        String output = Arrays.stream(stringArray)
                .sorted(Comparator.comparing(String::length,Comparator.reverseOrder()))
                .findFirst()
                .get();
        System.out.println(output);
    }
}
