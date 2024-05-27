package com.scaler.intermediate.dsa.module2.arrays.sliding.window.contribution;

/**
 * Given an array A of length N. Also given are integers B and C.
 * Return 1 if there exists a subarray with length B
 * having sum C and 0 otherwise.
 *
 * Input : A = [4, 3, 2, 6, 1] B = 3 C = 11
  * Output : 1
 * Explanation :
 * The subarray [3, 2, 6] is of length 3 and sum 11.
 *
 * Input : A = [4, 2, 2, 5, 1] B = 4 C = 6
 * Output : 0
 * Explanation :
 * There are no such subarray.
 *
 */
public class SubarrayWithGivenSumAndLength {
    public static int solve(int[] A, int B, int C) {
        int n = A.length;
        long sum = 0;
        for(int i = 0;i < B;i++){
            sum=sum+A[i];
        }
        if(sum == C){
            return 1;
        }
        for(int i = 1 ;i < n - B ;i++ ){
            int j = i + B-1;
            sum = sum + A[j] - A[i-1];
            if(sum == C){
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] A = {4, 3, 2, 6, 1};
        int B = 3;
        int C = 11;
        System.out.println(solve(A,B,C));
    }
}
