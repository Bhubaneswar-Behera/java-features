package com.scaler.advanced.dsa.advanceddsa1.module5.bit.maniplutaion.one;

/**
 * You are given two integers A and B.
 * Return 1 if B-th bit in A is set
 * Return 0 if B-th bit in A is unset
 * Note:
 * The bit position is 0-indexed, which
 * means that the least significant bit (LSB) has index 0.
 *
 * Input : A = 4 B = 1
 * Output : 0
 * Explanation : Given N = 4 which is 100 in binary. The 1-st bit is unset so we return 0
 *
 * Input 2: A = 5 B = 2
 * Output : 1
 * For Input 2: Given N = 5 which is 101 in binary. The 2-nd bit is set so we return 1
 */
public class CheckBit {
    public static int solve(int A, int B) {
        if((A & (1 << B)) > 0 ){
           return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        int A = 5;
        int B = 2;

        System.out.println(solve(A,B));
    }
}
