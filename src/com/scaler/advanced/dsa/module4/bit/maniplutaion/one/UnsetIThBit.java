package com.scaler.advanced.dsa.module4.bit.maniplutaion.one;

/**
 * You are given two integers A and B.
 * If B-th bit in A is set, make it unset.
 * If B-th bit in A is unset, leave as it is.
 * Return the updated A value.
 *
 * Input : A = 4 B = 1
 * Output : 4
 * Explanation : Given N = 4 which is 100 in binary. The 1-st bit is already unset
 *
 * Input : A = 5 B = 2
 * Output : 1
 * Explanation : Given N = 5 which is 101 in binary. We unset the 2-nd bit. It becomes 001 which is 1 in Decimal.
 */
public class UnsetIThBit {

    public static int solve(int A, int B) {
       if((A & (1<<B)) > 0){
           return (A ^ (1<<B));
       }
       return A;
    }

    public static void main(String[] args) {
        int A = 5;
        int B = 2;
        System.out.println(solve(A,B));
    }
}
