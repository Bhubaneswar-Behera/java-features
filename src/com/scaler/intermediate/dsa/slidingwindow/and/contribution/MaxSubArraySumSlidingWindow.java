package com.scaler.intermediate.dsa.slidingwindow.and.contribution;

/**
 * Given arr[n], print max subarray sum of
 * all subarrays of length k. [1<= k <= n]
 *
 */
public class MaxSubArraySumSlidingWindow {

    public static int maxSumSubArrayBruteForce(int[] A,int k){
        int n = A.length;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0;i < n - k ;i++){
            int j = i + k -1;
            int sum = 0;
            for(int l = i ;l <= j;l++){
                sum = sum + A[l];
            }
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }

    public static int maxSumSubArrayPrefixSum(int[] A,int k){
        int n = A.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = A[0];

        for(int i = 1; i < n;i++){
            prefixSum[i] = prefixSum[i - 1] + A[i];
        }
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i < n - k;i++){
            int j = i + k - 1;
            int sum = (i == 0 ? prefixSum[j] : prefixSum[j] - prefixSum[i - 1]);
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }

    public static int maxSumSubArraySlidingWindow(int[] A,int k){
        int n = A.length;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0;i < k;i++){
            sum = sum + A[i];
        }
        maxSum = sum;

        for(int i = 1 ;i <= n - k;i++){
            int j = i + k - 1;
            sum = sum + A[j] - A[i-1];
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] A = {-3,4,-2,5,3,-2,8,2,-1,4};
        int k = 5;
        System.out.println(maxSumSubArrayBruteForce(A,k));
        System.out.println(maxSumSubArraySlidingWindow(A,k));
        System.out.println(maxSumSubArrayPrefixSum(A,k));
    }
}
