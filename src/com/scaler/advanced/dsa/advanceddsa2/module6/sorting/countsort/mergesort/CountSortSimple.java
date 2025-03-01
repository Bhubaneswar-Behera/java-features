package com.scaler.advanced.dsa.advanceddsa2.module6.sorting.countsort.mergesort;

import java.util.Arrays;

/**
 * Find the smallest number that can be formed by rearranging the digits of the given number
 * in an array.Return as an array.
 *
 * Input :  {6,3,4,2,7,2,1}
 * Output : {1,2,2,3,4,6,7}
 *
 */
public class CountSortSimple {

    public static int[] countSortSimple(int[] A){
        int n = A.length;
        int[] count = new int[10];

        for (int i = 0; i < n ; i++) {
            count[A[i]] = count[A[i]] + 1;
        }
        int x = 0;
        for (int i = 0; i < 10 ; i++) {
            for (int j = 1; j <= count[i] ; j++) {
                A[x] = i;
                x++;
            }
        }
        return A;
    }
    public static void main(String[] args) {
        int[] A = {6,3,4,2,7,2,1};
        System.out.println(Arrays.toString(countSortSimple(A)));
    }
}
