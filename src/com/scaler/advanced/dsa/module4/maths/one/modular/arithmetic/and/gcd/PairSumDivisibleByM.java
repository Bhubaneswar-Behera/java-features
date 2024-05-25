package com.scaler.advanced.dsa.module4.maths.one.modular.arithmetic.and.gcd;

/**
 * Given an array of integers A and an integer B, find and return the number of pairs in A whose sum is divisible by B.
 * Since the answer may be large, return the answer modulo (109 + 7).
 * Note: Ensure to handle integer overflow when performing the calculations.
 *
 * Input 1: A = [1, 2, 3, 4, 5] B = 2 Output : 4
 * Explanation : All pairs which are divisible by 2 are (1,3), (1,5), (2,4), (3,5).
 * So total 4 pairs.
 *
 * Input 2: A = [5, 17, 100, 11] B = 28 Output : 1
 * Explanation : There is only one pair which is divisible by 28 is (17, 11)
 *
 */
public class PairSumDivisibleByM {
    public static int solve(int[] A, int B) {
        int n = A.length;
        int[] frequency = new int[B];
        int count = 0;

        for (int i = 0; i < n; i++) {
            int value = A[i] % B;
            int partner = (B - value) % B;
            count = (count + frequency[partner]) % 1000000007;
            frequency[value]++;
        }

        return count;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int B = 2;
        System.out.println(solve(A,B));

    }
}
