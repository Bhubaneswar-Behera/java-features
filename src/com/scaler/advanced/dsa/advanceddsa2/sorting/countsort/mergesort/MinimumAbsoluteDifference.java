package com.scaler.advanced.dsa.advanceddsa2.sorting.countsort.mergesort;

import java.util.Arrays;

/**
 * Given an array of integers A, find and return the
 * minimum value of | A [ i ] - A [ j ] | where i != j and |x| denotes the
 * absolute value of x.
 *
 * Input : A = [1, 2, 3, 4, 5]       Output : 1
 * Explanation : The absolute difference between any two adjacent elements is 1,
 * which is the minimum value.
 *
 * Input : A = [5, 17, 100, 11]      Output : 6
 * Explanation : The minimum value is 6 (|11 - 5| or |17 - 11|).
 */
public class MinimumAbsoluteDifference {
    public static int solve(int[] A) {
        int n = A.length;
        int answer = Integer.MAX_VALUE;
        Arrays.sort(A);

        for (int i = 0; i < n - 1; i++) {
            int currentDifference = A[i+1] - A[i];
            answer = Math.min(answer,currentDifference);
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        System.out.println(solve(A));
    }
}
