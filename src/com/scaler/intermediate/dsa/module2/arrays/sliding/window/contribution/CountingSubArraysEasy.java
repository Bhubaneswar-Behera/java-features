package com.scaler.intermediate.dsa.module2.arrays.sliding.window.contribution;

/**
 * Given an array A of N non-negative numbers and a non-negative number B,
 * you need to find the number of subarrays in A with a sum less than B.
 * We may assume that there is no overflow.
 *
 * Input : A = [2, 5, 6] B = 10 Output : 4
 * Explanation :
 * The subarrays with sum less than B are {2}, {5}, {6} and {2, 5},
 *
 * Input : A = [1, 11, 2, 3, 15] B = 10 Output : 4
 * Explanation :
 * The subarrays with sum less than B are {1}, {2}, {3} and {2, 3}
 *
 */
public class CountingSubArraysEasy {
    public static int solve(int[] A, int B) {
        int n = A.length;
        int answer = 0;

        for (int i = 0 ; i < n;i++) {
            int sum = 0;
            for(int j = i ; j< n ;j++){
                sum = sum + A[j];
                if (sum < B) {
                    answer++;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] A = {2, 5, 6};
        int B = 10;
        System.out.println(solve(A,B));

    }
}
