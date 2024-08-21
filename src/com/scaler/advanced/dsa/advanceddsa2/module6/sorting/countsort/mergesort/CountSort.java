package com.scaler.advanced.dsa.advanceddsa2.module6.sorting.countsort.mergesort;

import java.util.Arrays;

/**
 * Given an array A. Sort this array using Count Sort Algorithm and return the sorted array.
 * Input : A = [1, 3, 1]    Output : [1, 1, 3]
 * For Input : The array in sorted order is [1, 1, 3].
 *
 * Input : A = [4, 2, 1, 3] Output : [1, 2, 3, 4]
 * For Input : The array in sorted order is [1, 2, 3, 4].
 *
 */
public class CountSort {
    public static int[] solve(int[] A) {
        int n = A.length;
        int greatestElement = getMaxElement(A);
        int smallestElement = getMinElement(A);
        int[] count = new int[greatestElement + 1];

        for (int i = 0; i < n ; i++) {
            count[A[i] - smallestElement]++;
        }

        int x = 0;
        for (int i = 0; i < greatestElement ; i++) {
            while (count[i] > 0) {
                A[x] = i + smallestElement;
                x++;
                count[i]--;
            }
        }
        return A;
    }
    public static int getMaxElement(int[] A){
        int n = A.length;
        int answer = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            answer = Math.max(answer,A[i]);
        }
        return answer;
    }

    public static int getMinElement(int[] A){
        int n = A.length;
        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            answer = Math.min(answer,A[i]);
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] A = {1, 3, 1};
        System.out.println(Arrays.toString(solve(A)));
    }
}
