package com.scaler.advanced.dsa.advanceddsa1.module5.bit.maniplutaion.one;

/**
 * A group of computer scientists is working on a project that
 * involves encoding binary numbers. They need to create a binary number with a specific pattern
 * for their project. The pattern requires A 0's followed by B 1's followed by C 0's. To simplify the process,
 * they need a function that takes A, B, and C as inputs and returns the decimal value of the resulting binary number. Can you help them
 * by writing a function that can solve this problem efficiently?
 *
 *Example:
 * Input : A = 4 B = 3 C = 2
 * Output: 28
 * Explanation: The corresponding binary number is "000011100" whose decimal value is 28.
 */
public class SetBitsInARange {

    public static int solve(int A, int B, int C){
        return ((1<<B) -1) << C;
    }
    public static void main(String[] args) {
        int A = 4;
        int B = 3;
        int C = 2;
        System.out.println(solve(A,B,C));
    }
}
