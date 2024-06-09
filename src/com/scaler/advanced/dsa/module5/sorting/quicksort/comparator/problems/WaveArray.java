package com.scaler.advanced.dsa.module5.sorting.quicksort.comparator.problems;

import java.util.Arrays;

/**
 * Given an array of integers A, sort the array into a wave-like array and return it.
 * In other words, arrange the elements into a sequence such that
 *
 * a1 >= a2 <= a3 >= a4 <= a5.....
 *
 * NOTE: If multiple answers are possible, return the lexicographically smallest one.
 *
 * Input : A = [1, 2, 3, 4]     Output : [2, 1, 4, 3]
 * Explanation :One possible answer : [2, 1, 4, 3]
 * Another possible answer : [4, 1, 3, 2]
 * First answer is lexicographically smallest. So, return [2, 1, 4, 3].
 *
 * Input : A = [1, 2]           Output : [2, 1]
 * Explanation : Only possible answer is [2, 1].
 */
public class WaveArray {

    public static int[] wave(int[] A) {
        int n = A.length;
        Arrays.sort(A);
        for (int i = 0; i < n - 1 ; i = i + 2) { // have to swap adjacent elems so +2
            int temp = A[i];
            A[i] = A[i+1];
            A[i + 1] = temp;
        }

        return A;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        System.out.println(Arrays.toString(wave(A)));
    }
}
