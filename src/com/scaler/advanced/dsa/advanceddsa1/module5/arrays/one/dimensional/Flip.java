package com.scaler.advanced.dsa.advanceddsa1.module5.arrays.one.dimensional;

import java.util.Arrays;

/**
 * You are given a binary string A(i.e., with characters 0 and 1) consisting of characters A1, A2, ..., AN. In a single operation, you can choose two indices, L and R, such that 1 ≤ L ≤ R ≤ N and flip the characters AL, AL+1, ..., AR. By flipping, we mean changing character 0 to 1 and vice-versa.
 *Your aim is to perform ATMOST one operation such that in the final string number of 1s is maximized.
 *If you don't want to perform the operation, return an empty array. Else, return an array consisting of two elements denoting L and R. If there are multiple solutions, return the lexicographically smallest pair of L and R.
 * NOTE: Pair (a, b) is lexicographically smaller than pair (c, d) if a < c or, if a == c and b < d.
 *
 * Input : A = "010" Output : [1, 1]
 * Explanation :
 * A = "010"
 * Pair of [L, R] | Final string
 * _______________|_____________
 * [1 1]          | "110"
 * [1 2]          | "100"
 * [1 3]          | "101"
 * [2 2]          | "000"
 * [2 3]          | "001"
 *
 * We see that two pairs [1, 1] and [1, 3]
 * give same number of 1s in final string. So, we return [1, 1].
 *
 * Input : A = "111" Output 2: []
 * Explanation :
 * No operation can give us more than three 1s in final string.
 * So, we return empty array [].
 */
public class Flip {

    public static int[] flip(String A) {
        int count = 0; // Variable to keep track of the difference between 0s and 1s
        int l = 0; // Variable to track the start index of the range with maximum difference
        int r = 0; // Variable to track the end index of the range with maximum difference
        int max = 0; // Variable to store the maximum difference

        int[] res = new int[2]; // Array to store the result range
        res[0] = l; // Initialize the start index of the result range
        res[1] = r; // Initialize the end index of the result range

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '0') {
                count++; // Increment count if the current character is '0'
            } else {
                count--; // Decrement count if the current character is '1'
            }

            if (count > max) {
                max = count; // Update max if count is greater than the current max difference
                res[0] = l + 1; // Update the start index of the result range
                res[1] = r + 1; // Update the end index of the result range
            }

            if (count < 0) {
                l = i + 1; // Reset the start index if count becomes negative
                r = i + 1; // Reset the end index if count becomes negative
                count = 0; // Reset count to 0
            } else {
                r++; // Increment the end index if count is non-negative
            }
        }

        // If max difference is 0, return an empty array as no operations are required
        // Return the result range
        return max == 0 ? new int[0] : res;

    }
    public static void main(String[] args) {
        String A = "010";
        System.out.println(Arrays.toString(flip(A)));
    }
}
