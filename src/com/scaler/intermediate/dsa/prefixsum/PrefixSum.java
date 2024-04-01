package com.scaler.intermediate.dsa.prefixsum;

/**
 * Given n elements and q queries. for each query,
 * calculate sum of all elements
 * from l to r [0-based indices given in each query]
 *
 * Explanation :
 * int[] arr = {-3,6,2,4,5,2,8,-9,3 ,1};
 * l -> left index
 * r -> right index
 *
 * l= 4 , r = 8 , sum --> 5 + 2 + 8 + (-9) + 3 = 9
 * l= 3 , r = 7 , sum --> 4 +5 + 2 + 8 + (-9) = 10
 * l= 1 , r = 3 , sum --> 6 + 2 + 4 = 12
 * l= 0 , r = 4 , sum --> -3 + 6 +2 + 4 + 5 = 14
 * l= 7 , r = 7 , sum --> -9
 */
public class PrefixSum {

    public static void querySumBrute(int[] arr, int[][] queries, int n , int q) {
        for(int i = 0 ; i < n ; i++){
            int l = queries[i][0];
            int r = queries[i][1];
            int sum = 0;

            for(int j = l ; j <= r ; j++ ){
                sum = sum + arr[j];
            }
            System.out.println("l-->" + l +" r-->" + r + " Prefix sum : " +sum);
        }
    }
    public static void solve(int[] A, int[][] B, int n , int q) {
        int[] prefixSum = new int[n];
        prefixSum[0] = A[0];

        for(int  i = 1 ; i < n ; i++){
            prefixSum[i] = prefixSum[i -1] + A[i];
        }

        for(int i = 0; i <q;i++){
            int l = B[i][0];
            int r = B[i][1];
            int sum = 0;
            if(l == 0){
                sum = prefixSum[r];
            } else {
                sum = prefixSum[r] - prefixSum[l - 1];
            }
            System.out.println("l-->" + l +" r-->" + r + " Prefix sum : " +sum);
        }
    }

    public static void main(String[] args) {
        int[] arr = {-3,6,2,4,5,2,8,-9,3,1};
        int[][] queries = {{4,8},{3,7},{1,3},{0,4},{7,7}};
        //querySumBrute(arr,queries, arr.length, queries.length);
        solve(arr,queries,arr.length, queries.length);
    }
}
