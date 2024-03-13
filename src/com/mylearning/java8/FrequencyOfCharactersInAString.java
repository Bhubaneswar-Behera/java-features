package com.mylearning.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharactersInAString {
    public static void main(String[] args) {
        String input = "Bhubaneswar";
        Map<String, Long> countMap = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(countMap);
    }
}
