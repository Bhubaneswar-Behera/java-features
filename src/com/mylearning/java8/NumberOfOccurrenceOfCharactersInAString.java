package com.mylearning.java8;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberOfOccurrenceOfCharactersInAString {
    public static void main(String[] args) {
        String str = "mylearningjavaandspring";
        var output = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("output : "+output);
    }
}
