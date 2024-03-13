package com.mylearning.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElementsInAString {
    public static void main(String[] args) {
        String str = "ilovejavaandspring";

        var duplicateElements = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue()> 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(duplicateElements);


    }
}
