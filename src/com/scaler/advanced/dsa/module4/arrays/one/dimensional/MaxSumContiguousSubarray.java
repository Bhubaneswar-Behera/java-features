package com.scaler.advanced.dsa.module4.arrays.one.dimensional;

/**
 * Given an integer Array[n] , find the maximum subarrray sum
 * out of all subarrays.
 *
 * Ex:
 * Input : A {-2,3,4,-1,5,-10,7}
 * OutPut: maxSum = 11
 * Explanation : 3+4+(-1)+5 = 11
 *
 */
public class MaxSumContiguousSubarray {
    public static int maxSumContributionTechnique(int[] A,int n){
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i < n ;i++){
            int sum = 0;
            for (int j = i; j < n ; j++) {
                   sum = sum + A[j];
                   if(sum > maxSum){
                       maxSum = sum;
                   }
                   //OR
                   //maxSum = Math.max(maxSum,sum);
            }
        }
        return maxSum;
    }
    public static int maxSumKadanesAlgorithm(int[] A,int n){
        int maxSum = Integer.MIN_VALUE;
        int current = 0;

        for (int i = 0; i < n ; i++) {
            current = current + A[i];
            if(current > maxSum){
                maxSum = current;
            }
            //OR
            //Math.max(maxSum,current);
            if(current < 0){
                current = 0;
            }
        }

        return maxSum;
    }

    public static int maxSumKadanesAlgorithm1(int[] A,int n){
        int maxSum = Integer.MIN_VALUE;
        int current = 0;
        int i = 0;

        while (i < n) {
            current = current + A[i];
            if(current > maxSum){
                maxSum = current;
            }
            //OR
            //Math.max(maxSum,current);
            if(current < 0){
                current = 0;
            }
            i++;
        }

        return maxSum;
    }



    public static int maxSubArray(final int[] A) {
        int n = A.length;
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < n; i++) {
            currentSum =currentSum + A[i];
            if(currentSum > maxSum){
                maxSum  = currentSum;
            }
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, -10};
        int n = A.length;
        System.out.println(maxSumContributionTechnique(A,n));
        System.out.println(maxSumKadanesAlgorithm(A,n));
        System.out.println(maxSumKadanesAlgorithm1(A,n));
        System.out.println(maxSubArray(A));

    }
}
