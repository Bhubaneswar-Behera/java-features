package com.scaler.intermediate.dsa.module3.sorting.basics;

import java.util.Arrays;

/**
 * Given an integer array A of size N. Return 1 if the array can be arranged to form an arithmetic progression,
 * otherwise return 0.
 * A sequence of numbers is called an arithmetic progression if the difference between
 * any two consecutive elements is the same.Given an integer array A of size N.
 *
 * Return 1 if the array can be arranged to form an arithmetic progression, otherwise return 0.
 * Input Format
 * The first and only argument is an integer array A of size N.
 *
 * Output Format
 * Return 1 if the array can be rearranged to form an arithmetic progression, otherwise return 0.
 *
 * Input : A = [3, 5, 1] Output : 1
 * Explanation : We can reorder the elements as [1, 3, 5] or [5, 3, 1]
 *  with differences 2 and -2 respectively, between each consecutive elements.
 *
 * Input : A = [2, 4, 1] Output : 0
 * Explanation : There is no way to reorder the elements to obtain an arithmetic progression.
 *
 *
 *
 */
public class ArithmeticProgression {
    public static  int solve(int[] A) {
        Arrays.sort(A);
        int n = A.length;
        int diff = A[1] - A[0];
        for(int i = 2;i< n;i++){
            if(A[i] - A[i-1] != diff){
                return 0;
            }
        }
        return 1;
    }


    public static void main(String[] args) {
        int[] A = {3, 5, 1};
        System.out.println(solve(A));
    }
}
