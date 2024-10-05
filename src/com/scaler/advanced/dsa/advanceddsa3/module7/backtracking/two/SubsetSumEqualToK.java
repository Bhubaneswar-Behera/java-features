package com.scaler.advanced.dsa.advanceddsa3.module7.backtracking.two;

/**
 * Given an integer array A of size N.
 * You are also given an integer B, you need to find whether
 * their exist a subset in A whose sum equal B.
 * If there exist a subset then return 1 else return 0.
 *
 * Note : Sum of elements of an empty subset is 0.
 *
 * Example :
 * Input : A = [3, 34, -3, 12, 5, 2]  B = 9
 * Output : 1
 * Explanation : There is a subset (-3, 12) with sum 9.
 *
 * Input : A = [-8, 34, 4, 0, -5, -2] B = -20
 * Output : 0
 * Explanation : There is no subset that add up to -20.
 *
 */
public class SubsetSumEqualToK {

    public int SubsetSum(int[] A, int B) {
        int N = A.length;
        // Iterate over all possible subsets using bitmasking
        for (int mask = 0; mask < (1 << N); mask++) {
            int sum = 0;
            for (int i = 0; i < N; i++) {
                // If the i-th bit is set in mask, include A[i] in the current subset
                if ((mask & (1 << i)) != 0) {
                    sum += A[i];
                }
            }
            // If we find a subset with sum equal to B, return 1
            if (sum == B) {
                return 1;
            }
        }
        // No subset with sum B was found, return 0
        return 0;
    }
    public static void main(String[] args) {

    }
}
