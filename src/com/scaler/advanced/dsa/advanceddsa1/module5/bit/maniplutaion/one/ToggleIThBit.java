package com.scaler.advanced.dsa.advanceddsa1.module5.bit.maniplutaion.one;

/**
 * ou are given two integers A and B.
 * If B-th bit in A is set, make it unset
 * If B-th bit in A is unset, make it set
 * Return the updated A value
 *
 * Input : A = 4 B = 1
 * Explanation :
 * Given N = 4 which is 100 in binary. The 1-st bit is unset
 * so we make it set
 *
 * Input : A = 5 B = 2
 * Explanation :
 * Given N = 4 which is 100 in binary. The 1-st bit is unset
 * so we make it set
 * Explanation:
 * Given N = 5 which is 101 in binary. The 2-nd bit is set
 * so we make it unset
 *
 */
public class  ToggleIThBit {
    public static int solve(int A, int B) {
        return A ^(1 << B);
    }

    public static void main(String[] args) {
        int A = 5;
        int B = 2;

        System.out.println(solve(A,B));
    }
}
