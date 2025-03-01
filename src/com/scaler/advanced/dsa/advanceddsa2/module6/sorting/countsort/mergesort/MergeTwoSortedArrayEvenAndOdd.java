package com.scaler.advanced.dsa.advanceddsa2.module6.sorting.countsort.mergesort;

import java.util.Arrays;

/**
 * Given an integer arr[] wheer all odd elements are sorted and all even elements are sorted.
 * Sort the entire array
 *
 * Input  : [ 2, 5, 4, 8, 11, 13, 10, 15, 21 ]
 * Output : [ 2, 4, 5, 8, 10, 11, 13, 15, 21 ]
 */
public class MergeTwoSortedArrayEvenAndOdd {

    public static void merge(int[] A){
        int n = A.length;
        int countOdd = 0;
        int countEven = 0;
        //form 2 arrays for even and odd
        for (int i = 0; i < n ; i++) {
            if (A[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        int[] evenArray = new int[countEven];
        int[] oddArray = new int[countOdd];

        int e = 0;
        int o = 0;

        //populate even and odd in the respective even and odd arrys
        for (int i = 0; i < n ; i++) {
            if (A[i] % 2 == 0) {
                evenArray[e] = A[i];
                e++;
            } else {
                oddArray[o] = A[i];
                o++;
            }
        }

        int x = 0; // moves over A
        e = 0; // moves over EVEN
        o = 0; // moves over ODD

        while (e < countEven && o < countOdd) {
            if (evenArray[e] < oddArray[o]) {
                A[x] = evenArray[e];
                e++;
                x++;
            } else {
                A[x] = oddArray[o];
                o++;
                x++;
            }
        }

        while (e < countEven) {
            A[x] = evenArray[e];
            e++;
            x++;
        }

        while (o < countOdd) {
            A[x] = oddArray[o];
            o++;
            x++;
        }

    }
    public static void main(String[] args) {
        int[] A = {2,5,4,8,11,13,10,15,21};
        merge(A);
        System.out.println(Arrays.toString(A));
    }

}
