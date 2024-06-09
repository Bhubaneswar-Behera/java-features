package com.scaler.advanced.dsa.module5.sorting.quicksort.comparator.problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * You are given an array A of N elements.
 * Sort the given array in increasing order of number of distinct factors
 * of each element, i.e., element having the least number of factors
 * should be the first to be displayed and the number having highest number of factors
 * should be the last one.
 * If 2 elements have same number of factors, then number with less value should come first.
 *
 * Note: You cannot use any extra space
 *
 * Input : A = [6, 8, 9]  Output : [9, 6, 8]
 * Explanation : The number 9 has 3 factors, 6 has 4 factors and 8 has 4 factors.
 *
 * Input : A = [2, 4, 7]  Output : [2, 7, 4]
 * Explanation:  The number 2 has 2 factors, 7 has 2 factors and 4 has 3 factors.
 */


public class FactorsSort implements Comparator<Integer> {

    public static int[] solve(int[] A) {
        List<Integer> integerList =
                Arrays.stream(A).boxed().collect(Collectors.toList());
        Collections.sort(integerList, new FactorsSort());

        return integerList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int countFactors(int n){
        int count = 0;

        for (int i = 1; i * i <= n  ; i++) {
            if (n % i == 0) {
                count++;
                if (i != n / i) {
                    count++;
                }
            }
        }
        return count;
    }

    @Override
    public int compare(Integer val1, Integer val2) {
        int c1 = countFactors(val1);
        int c2 = countFactors(val2);
        if (c1 != c2) {
            return c1 - c2;
        }
        return val1 - val2;
    }


    public static void main(String[] args) {
        int[] A = {6, 8, 9};
        System.out.println(Arrays.toString(solve(A)));

    }
}
