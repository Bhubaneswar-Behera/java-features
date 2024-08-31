package com.scaler.advanced.dsa.advanceddsa2.module6.stacks2;

import java.util.Stack;

/**
 * Given an array of integers A.
 * The value of an array is computed as the difference between the maximum element in the array and the minimum
 * element in the array A.
 * Calculate and return the sum of values of all possible subarrays of A modulo 109+7.
 *
 * Example:
 * Input : A = [1] Output : 0
 * Explanation 1: Only 1 subarray exists. Its value is 0.
 *
 * Input : A = [4, 7, 3, 8]  Output : 26
 * Explanation 2:
 *  value ( [4] ) = 4 - 4 = 0
 *  value ( [7] ) = 7 - 7 = 0
 *  value ( [3] ) = 3 - 3 = 0
 *  value ( [8] ) = 8 - 8 = 0
 *  value ( [4, 7] ) = 7 - 4 = 3
 *  value ( [7, 3] ) = 7 - 3 = 4
 *  value ( [3, 8] ) = 8 - 3 = 5
 *  value ( [4, 7, 3] ) = 7 - 3 = 4
 *  value ( [7, 3, 8] ) = 8 - 3 = 5
 *  value ( [4, 7, 3, 8] ) = 8 - 3 = 5
 *  sum of values % 10^9+7 = 26
 *
 */
public class MaxAndMin {
    private static final int MOD = 1000000007;

    public static int solve(int[] A) {
        int n = A.length;
        long result = 0;

        // Arrays to store the next and previous greater/smaller elements
        int[] nextGreater = new int[n];
        int[] prevGreater = new int[n];
        int[] nextSmaller = new int[n];
        int[] prevSmaller = new int[n];

        // Initialize arrays with default values
        for (int i = 0; i < n; i++) {
            nextGreater[i] = n;
            nextSmaller[i] = n;
            prevGreater[i] = -1;
            prevSmaller[i] = -1;
        }

        // Find next smaller elements
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && A[stack.peek()] > A[i]) {
                nextSmaller[stack.pop()] = i;
            }
            stack.push(i);
        }

        // Find previous smaller elements
        stack.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && A[stack.peek()] >= A[i]) {
                prevSmaller[stack.pop()] = i;
            }
            stack.push(i);
        }

        // Find next greater elements
        stack.clear();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && A[stack.peek()] < A[i]) {
                nextGreater[stack.pop()] = i;
            }
            stack.push(i);
        }

        // Find previous greater elements
        stack.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && A[stack.peek()] <= A[i]) {
                prevGreater[stack.pop()] = i;
            }
            stack.push(i);
        }

        // Calculate the sum of values of all possible subarrays
        for (int i = 0; i < n; i++) {
            long countAsMax = (long) (i - prevGreater[i]) * (nextGreater[i] - i) % MOD;
            long countAsMin = (long) (i - prevSmaller[i]) * (nextSmaller[i] - i) % MOD;

            result = (result + (countAsMax - countAsMin + MOD) % MOD * A[i] % MOD) % MOD;
        }

        return (int) result;
    }
    public static void main(String[] args) {
        int[] A = {4, 7, 3, 8};
        System.out.println(solve(A));
    }
}
