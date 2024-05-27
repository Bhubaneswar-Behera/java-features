package com.scaler.advanced.dsa.module4.recursion.one;

/**
 * Given a number A, we need to find the sum of its digits using recursion.
 *
 * Input : A = 46 Output : 10
 * Explanation : Sum of digits of 46 = 4 + 6 = 10
 *
 * Input : A = 11 Output : 2
 * Explanation : Sum of digits of 11 = 1 + 1 = 2
 */
public class SumOfDigits {
    public static int solve(int A) {
        if(A == 0){
            return 0;
        }
        return A % 10 + solve(A / 10);
    }
    public static void main(String[] args) {
        int A = 46;
        System.out.println(solve(A));
    }
}
