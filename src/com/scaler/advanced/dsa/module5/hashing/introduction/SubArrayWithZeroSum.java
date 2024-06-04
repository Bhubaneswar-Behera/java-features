package com.scaler.advanced.dsa.module5.hashing.introduction;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.
 * If the given array contains a sub-array with sum zero return 1, else return 0.
 *
 * Input : A = [1, 2, 3, 4, 5]   Output : 0
 * Explanation : No subarray has sum 0.
 *
 * Input : A = [4, -1, 1]   Output : 1
 * Explanation : The subarray [-1, 1] has sum 0.
 */
public class SubArrayWithZeroSum {
    public static int solve(int[] A) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.
        int n = A.length;
        Set<Long> hashSet = new HashSet<>();
        Long sum = 0l;


        for (int i = 0; i < n; i++) {
            sum = sum + A[i];
            if (sum == 0 || hashSet.contains(sum)) {
                return 1;
            }
            hashSet.add(sum);
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] A = {4, -1, 1};
        System.out.println(solve(A));
    }
}
