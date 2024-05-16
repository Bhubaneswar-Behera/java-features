package com.scaler.advanced.dsa.module4.maths.one.modular.arithmetic.and.gcd;

/**
 * Given two integers A and B, find the greatest possible positive integer M,
 * such that A % M = B % M.
 *
 * Input : A = 1 B = 2 Output : 1
 * Explanation : 1 is the largest value of M such that A % M == B % M.
 * Input : A = 5 B = 10 Output : 5
 * Explanation : For M = 5, A % M = 0 and B % M = 0.
 *  No value greater than M = 5, satisfies the condition.
 *
 */
public class ABAndModulo {
    public static int solve(int A, int B) {
        return Math.abs(A-B);
    }
    public static void main(String[] args) {
        int A = 1;
        int B = 2;
        System.out.println(solve(A,B));
    }
}
