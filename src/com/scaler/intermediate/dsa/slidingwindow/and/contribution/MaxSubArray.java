package com.scaler.intermediate.dsa.slidingwindow.and.contribution;

/**
 * You are given an integer array C of size A.
 * Now you need to find a subarray (contiguous elements) so that
 * the sum of contiguous elements is maximum.
 * But the sum must not exceed B.
 *
 * Input : A = 5 B = 12 C = [2, 1, 3, 4, 5]
 * Explanation :
 * We can select {3,4,5} which sums up to 12 which is the maximum possible sum.
 *
 * Input : A = 3 B = 1 C = [2, 2, 2]
 *
 * Explanation :
 * All elements are greater than B, which means we cannot select any subarray.
 * Hence, the answer is 0.
 */
public class MaxSubArray {
    public static int maxSubarray(int n, int B, int[] C) {
        int maxSum = 0;
        for (int i = 0;i< n;i++) {
            int sum = 0;
            for(int j = i ;j < n;j++){
                sum = sum + C[j];
                if(sum <= B){
                    maxSum = Math.max(maxSum,sum);
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] C = {2, 1, 3, 4, 5};
        int A = C.length;
        int B = 12;
        System.out.println(maxSubarray(A,B,C));
    }
}
