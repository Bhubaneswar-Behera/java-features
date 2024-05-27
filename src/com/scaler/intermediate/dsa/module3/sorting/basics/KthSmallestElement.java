package com.scaler.intermediate.dsa.module3.sorting.basics;

import java.util.Arrays;

/**
 * Find the Bth smallest element in given array A .
 *
 * NOTE: Users should try to solve it in less than equal to B swaps.
 *
 * Input : A = [2, 1, 4, 3, 2] B = 3
 * Output : 2
 *
 * Input : A = [1, 2] B = 2
 * Output : 2
 */
public class KthSmallestElement {
    public static int kthsmallest(final int[] A, int B) {
        int answer = 0;
        Arrays.sort(A);

        return A[B-1];
    }
    public static void main(String[] args) {
        int[] A = {2, 1, 4, 3, 2};
        int B = 3;
        System.out.println(kthsmallest(A,B));

    }
}
