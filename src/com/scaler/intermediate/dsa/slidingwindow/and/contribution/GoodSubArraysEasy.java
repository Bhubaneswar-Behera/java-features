package com.scaler.intermediate.dsa.slidingwindow.and.contribution;

/**
 * Given an array of integers A, a subarray of an array
 * is said to be good if it fulfills any one of the criteria:
 *
 * 1. Length of the subarray is be even, and the sum
 * of all the elements of the subarray must be less than B.
 *
 * 2. Length of the subarray is be odd, and the
 * sum of all the elements of the subarray must be greater than B.
 *
 * Your task is to find the count of good subarrays in A.
 *
 * Example Input : A = [1, 2, 3, 4, 5] B = 4
 * Output : 6
 *Explanation :
 * Even length good subarrays = {1, 2}
 * Odd length good subarrays = {1, 2, 3}, {1, 2, 3, 4, 5}, {2, 3, 4}, {3, 4, 5}, {5}
 */
public class GoodSubArraysEasy {
    public static int solve(int[] A, int B) {
        int n = A.length;
        int answer = 0;
        for(int i = 0;i < n ;i++){
            int sum = 0;
            for(int j = i ;j < n ;j++){
                sum = sum + A[j];
                int length =  j - i +1;
                if((length % 2==0 && sum < B) || (length % 2 == 1 && sum > B)){
                    answer++;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int B = 4;
        System.out.println(solve(A,B));
    }
}
