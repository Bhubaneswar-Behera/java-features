package com.scaler.intermediate.dsa.module2.arrays.prefixsum;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given an array A of N integers.
 * Construct prefix sum of the array in the given array itself.
 *
 *Input : A = {1, 2, 3, 4, 5}
 * Output : A = {1, 3, 6, 10, 15}
 *
 * Input : A = [4, 3, 2]
 * Output : A {4,3,9}
 */
public class InPlacePrefixSum {

    public static int[] solve(int[] A) {

        for (int i = 1; i < A.length; i++) {
            A[i] = A[i - 1] + A[i];
        }
        return A;
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        for (int i = 1 ; i < A.size();i++) {
            A.set(i , A.get(i -1) + A.get(i));
        }

        return A;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solve(A)));

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        solve(arrayList);
        System.out.println(arrayList);
    }
}
