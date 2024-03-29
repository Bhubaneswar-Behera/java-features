package com.scaler.introduction.to.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array A of size N. You need to find the sum of
 * Maximum and Minimum element in the given array.
 *
 * A = [-2, 1, -4, 5, 3]     O/p = 1 [5+(-4) = 1]
 * A = [1, 3, 4, 1]          O/P = 5 [4 + 1 = 5]
 */
public class MaxMinOfAnArray {

    public static int solve(ArrayList<Integer> A) {

        Integer max = Integer.MIN_VALUE;
        Integer min = Integer.MAX_VALUE;

        for(int i = 0 ; i < A.size() ;i++){
            max = Math.max(max,A.get(i));
            min = Math.min(min,A.get(i));
        }

        System.out.println(max);
        System.out.println(min);
        return max+min;
    }


    public static int solve(int[] A) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int a : A){
            max = Math.max(max,a);
            min = Math.min(min,a);
        }
        return max+min;
    }


    public static void main(String[] args) {
        ArrayList A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(1);
        System.out.println(solve(A));

        int[] arr = {-2, 1, -4, 5, 3};
        solve(arr);
        System.out.println(Arrays.toString(arr));

    }
}
