package com.scaler.advanced.dsa.advanceddsa1.module5.hashing.introduction;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array A of N integers, return the number of unique elements in the array.
 *
 * Input : A = [3, 4, 3, 6, 6]  Output : 3
 * Explanation :
 *  The distinct elements of the array are 3, 4 and 6.
 *
 *
 * Input : A = [3, 3, 3, 9, 0, 1, 0] Output : 4
 * Explanation:
 *  The distinct elements of the array are 3, 9, 0 and 1.
 *
 */
public class CountDistinctElements {
    public static int solve(int[] A) {
        int n = A.length;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n ; i++) {
            set.add(A[i]);
        }
        System.out.println("Distinct elements are : "+set);
        return set.size();
    }
    public static void main(String[] args) {
        int[] A = {3, 4, 3, 6, 6};
        System.out.println(solve(A));
    }
}
