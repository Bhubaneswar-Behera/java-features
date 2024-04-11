package com.scaler.intermediate.dsa.prefixsum;

/**
 * You are given an array A of integers of size N.
 *Your task is to find the equilibrium index of the given array
 *The equilibrium index of an array is an index such that
 * the sum of elements at lower indexes is equal to the sum of elements
 * at higher indexes.
 *
 * If there are no elements that are at lower indexes
 * or at higher indexes, then the corresponding sum of elements is considered as 0.
 *
 * Note:
 *Array indexing starts from 0.
 * If there is no equilibrium index then return -1.
 * If there are more than one equilibrium indexes then return the minimum index.
 *
 * Output Format
 * Return the equilibrium index of the given array.
 * If no such index is found then return -1.
 *
 * Input 1 : [-7, 1, 5, 2, -4, 3, 0]    Output : 3
 * Input 2:  [1, 2, 3]                  Output : -1
 */
public class EquilibriumIndexOfAnArray {

    public static  int solve(int[] A) {
        int n = A.length;
        long[] prefixSumArray = new long[n];
        prefixSumArray[0] = A[0];
        int answer  = -1;

        for(int i = 1 ; i < n;i++ ){
            prefixSumArray[i] = prefixSumArray[i - 1] + A[i];
        }

        for(int i = 0 ;i < n ;i++){
            long leftSum = 0;

            //to handle outOfBoundException leftSum(i - 1) where i = 0 , so leftSum(-1)
            if(i == 0){
                leftSum = 0;
            } else{
                leftSum = prefixSumArray[i-1];
            }
            //0,1,2,3,4,5..........i-1,i,i+1.......N-1
            //sum 0 to i - 1 and i + 1 to N - 1
            //leftSum (i-1-0) ==> prefix(i-1) ,
            //rightSum = prefix[N-1] - prefix[i+1-1] => prefix[N-1] - prefix[i]
            long rightSum = prefixSumArray[n - 1] - prefixSumArray[i];
            if(leftSum == rightSum){
               return i;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        int[] A = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(solve(A));
    }
}
