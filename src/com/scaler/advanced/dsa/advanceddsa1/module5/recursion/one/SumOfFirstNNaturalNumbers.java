package com.scaler.advanced.dsa.advanceddsa1.module5.recursion.one;

/**
 * Find the sum of the first N natural numbers.
 *
 */
public class SumOfFirstNNaturalNumbers {
    public static int sum(int N) {
        if (N == 1) {
            return 1;
        }
        return sum(N-1) + N;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));

    }
}
