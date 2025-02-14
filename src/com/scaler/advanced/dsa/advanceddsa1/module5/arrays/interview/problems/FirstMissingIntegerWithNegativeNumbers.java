package com.scaler.advanced.dsa.advanceddsa1.module5.arrays.interview.problems;

/**
 * Given an unsorted list of integer array, A of size N.
 * Find the first missing positive integer.
 *
 * Note: Your algorithm should run in O(n) time and use constant space.
 *       Assume all elements are not necessarily positive
 *
 * Input : [4,0,1,-5,-10,8,2,6] Output : 3
 *
 */
public class FirstMissingIntegerWithNegativeNumbers {
    public static int firstMissingPositive(int[] A) {
        int n = A.length;

        for (int i = 0; i < n ; i++) {
            if(A[i] <= 0){
                A[i] = n + 2;
            }
        }

        for (int i = 0; i < n ; i++) {
            int x = Math.abs(A[i]);
            if(x >= 1 && x <= n){
                A[x - 1] = -1 * Math.abs(A[x]);
            }
        }

        for (int i = 1; i <= n; i++) {
            if(A[i-1] > 0){
                return i;
            }
        }

        return n + 1;
    }
    public static void main(String[] args) {
        //int[] A = {4,0,1,-5,-10,8,2,6};
        int[] A = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,20};
        int[] A1  = {1,2,3};
        System.out.println(firstMissingPositive(A));
    }
}
