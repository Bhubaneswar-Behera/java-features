package com.scaler.intermediate.dsa.module2.arrays.prefixsum;

/**
 * Given an array A[n] and "q" queries with start(s) and end(e) indices.
 * For every query , return the sum of all even indices elements from
 * s to e.
 *
 * Input : A --> {2,3,1,6,4,5}
 * Queries :
 * s  e
 * 1  3  --> 1
 * 2  5  --> 1 + 4 = 5
 * 0  4  --> 2 + 1 + 4 = 7
 * 3  3  --> 0
 *
 */
public class SumOfEvenIndices {

    public static void solve(int[] A, int[][] B,int n, int q){
        int[] prefixSumArray = new int[n];
        prefixSumArray[0] = A[0];

        for(int i = 1 ; i < n ;i++){
            if(i % 2 == 0){
                prefixSumArray[i] = prefixSumArray[i -1] + A[i];
            } else{
                prefixSumArray[i] = prefixSumArray[i - 1];
            }
        }

        for(int i = 0 ;i < q; i++){
            int l = B[i][0];
            int r = B[i][1];
            int sum = 0;

            if(l == 0){
                sum =  prefixSumArray[r];
            } else {
                sum = prefixSumArray[r] - prefixSumArray[l - 1];
            }
            System.out.println("l-->" + l +" r-->" + r + " Even index sum : " +sum);
        }

    }
    public static void main(String[] args) {
        int[] arr = {2,3,1,6,4,5};
        int[][] queries = {{1,3},{2,5},{0,4},{3,4}};
        int n = arr.length;
        int q = queries.length;;
        solve(arr,queries,n,q);
    }
}
