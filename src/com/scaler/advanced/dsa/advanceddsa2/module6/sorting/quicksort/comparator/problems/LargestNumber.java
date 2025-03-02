package com.scaler.advanced.dsa.advanceddsa2.module6.sorting.quicksort.comparator.problems;

import java.util.*;

/**
 * Given an array A of non-negative integers, arrange them such that they form the largest number.
 * Note: The result may be very large, so you need to return a string instead of an integer.
 *
 * Input : A = [3, 30, 34, 5, 9]  Output : "9534330"
 * Explanation : Reorder the numbers to [9, 5, 34, 3, 30] to form the largest number.
 *
 * Input : A = [2, 3, 9, 0]       Output : "9320"
 * Explanation : Reorder the numbers to [9, 3, 2, 0] to form the largest number 9320.
 *
 *
 *
 *
 *
 */
public class LargestNumber {

    public static String largestNumber(ArrayList<Integer> A) {

        Collections.sort(A, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                String s1 = ""+ a + b;
                String s2 = ""+ b + a;
                return s2.compareTo(s1);
            }
        });

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < A.size(); i++) {
            sb.append(A.get(i));
        }
        if(A.get(0) == 0) {
            return "0";
        }
        return sb.toString();

    }


    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(3);
        A.add(30);
        A.add(34);
        A.add(5);
        A.add(9);
        System.out.println(largestNumber(A));
    }


}
