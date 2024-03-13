package com.mylearning.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartsWithOne {
    public static void main(String[] args) {
        int[] stringArray = {5,9,11,2,8,21,1};

        List<String> stringList = Arrays.stream(stringArray)
                .boxed()
                .map(e -> "" + e)
                .filter(e -> e.startsWith("1"))
                .collect(Collectors.toList());
        System.out.println(stringList);
    }
}
