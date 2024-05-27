package com.scaler.intermediate.dsa.module2.arrays.prefixsum;

import java.util.Arrays;

/**
 * You are given an integer array A of length N.
 * You are also given a 2D integer array B with dimensions M x 2,
 * where each row denotes a [L, R] query.
 * For each query, you have to find the sum of all
 * elements from L to R indices in A (0 - indexed).
 * More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
 *
 * Input Format
 * The first argument is the integer array A.
 * The second argument is the 2D integer array B.
 *
 * Example Input : A = [1, 2, 3, 4, 5]   B = [[0, 3], [1, 2]]
 * Output : [10, 5]
 *
 * Input 2 : A = [2, 2, 2] B = [[0, 0], [1, 2]]
 * Output 2: [2, 4]
 *
 */
public class RangeSumQuery {

    public static long[] rangeSumBrute(int[] A,int[][] B){
        int n = A.length;

        long[] answer = new long[n];

        for(int i = 0;i < n;i++){
            int l = B[i][0];
            int r = B[i][1];
            int sum = 0;
            for(int j = l;j <= r ; j++){
                answer[j] = sum + A[j];
            }
        }
        return answer;
    }

    public static long[] rangeSum(int[] A, int[][] B) {
        int  n = A.length;
        int q = B.length;

        long[] answer = new long[q];
        long[] prefixSum = new long[n];
        prefixSum[0] = A[0];

        for(int i = 1 ; i < n ; i++){
            prefixSum[i] = prefixSum[i - 1] + A[i];
        }

        for(int  i = 0 ; i< q ; i++){
            int l = B[i][0];
            int r = B[i][1];

            if(l == 0){
                answer[i] = prefixSum[r];
            } else{
                answer[i] = prefixSum[r] - prefixSum[l - 1];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] A = {4,5,6,9,4,1,8,3};
        int[][] B = {{0, 3}, {1, 2}};
        System.out.println(Arrays.toString(rangeSum(A,B)));
    }
}
