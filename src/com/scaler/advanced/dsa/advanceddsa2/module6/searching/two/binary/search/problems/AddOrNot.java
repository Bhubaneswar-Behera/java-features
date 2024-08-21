package com.scaler.advanced.dsa.advanceddsa2.module6.searching.two.binary.search.problems;

import java.util.Arrays;

/**
 * Given an array of integers A of size N and an integer B.
 *
 * In a single operation, any one element of the array can be increased by 1. You are allowed to do at most B such operations.
 *
 * Find the number with the maximum number of occurrences and return an array C of size 2, where C[0] is the number of occurrences, and C[1] is the number with maximum occurrence.
 * If there are several such numbers, your task is to find the minimum one.
 *
 * Input : A = [3, 1, 2, 2, 1] B = 3 Output : [4, 2]
 * Explanation : Apply operations on A[2] and A[4] A = [3, 2, 2, 2, 2]
 *  Maximum occurence =  4
 *  Minimum value of element with maximum occurence = 2
 *
 * Input : A = [5, 5, 5] B = 3 c`Output : [3, 5]
 * Explanation : A = [5, 5, 5]
 *  Maximum occurence =  3
 *  Minimum value of element with maximum occurence = 5
 */
public class AddOrNot {
    public static int[] solve(int[] A, int B) {
        Arrays.sort(A);
        int n = A.length;
        int left = 0, maxCount = 0, numWithMaxCount = 0;
        long total = 0;

        for (int right = 0; right < n; right++) {
            total += A[right];

            // Check if we can make all elements from A[left] to A[right] equal to A[right]
            while ((long)A[right] * (right - left + 1) - total > B) {
                total -= A[left];
                left++;
            }

            int count = right - left + 1;
            if (count > maxCount) {
                maxCount = count;
                numWithMaxCount = A[right];
            }
        }

        return new int[]{maxCount, numWithMaxCount};
    }
    public static void main(String[] args) {
        int[] A = {3, 1, 2, 2, 1};
        int B = 3;
        System.out.println(Arrays.toString(solve(A,B)));

    }
}
