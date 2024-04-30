package com.scaler.advanced.dsa.module4.bit.maniplutaion.one;

/**
 * You are given two integers A and B.
 * Set the A-th bit and B-th bit in 0,
 * and return output in decimal Number System.
 *
 * Input: A = 3 B = 5
 * Output : 40
 *
 * Explanation :
 * The binary expression is 101000 which is 40 in decimal.
 */
public class SetBit {

    public static int solve(int A, int B) {
        int answer = 0;
        //set Ath Bit
        answer = answer | (1 << A);

        //set Bth Bit
        answer = answer | (1 << B);
        return answer;

    }
    public static void main(String[] args) {
        int A = 3;
        int B = 5;
        System.out.println(solve(A,B));
    }
}
