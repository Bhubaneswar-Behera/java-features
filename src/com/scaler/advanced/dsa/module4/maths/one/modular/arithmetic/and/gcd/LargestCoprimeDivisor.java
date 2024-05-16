package com.scaler.advanced.dsa.module4.maths.one.modular.arithmetic.and.gcd;

/**
 * You are given two positive numbers A and B .
 * You need to find the maximum valued integer X such that:
 * X divides A i.e. A % X = 0
 * X and B are co-prime i.e. gcd(X, B) = 1
 *
 * Input : A = 30 B = 12 Output : 5
 * Explanation : All divisors of A are (1, 2, 3, 5, 6, 10, 15, 30).
 * The maximum value is 5 such that A%5 == 0 and gcd(5,12) = 1
 *
 * Input : A = 5 B = 10 Output : 1
 * Explanation : 1 is the only value such that A%5 == 0 and gcd(1,10) = 1
 *
 */
public class LargestCoprimeDivisor {
    public static int cpFact(int A, int B) {
        int gcd = gcd(A,B);
        if (gcd == 1) {
            return A;
        }
        return cpFact(A/gcd ,B);
    }

    public static int gcd(int A, int B){
        if (B == 0) {
            return A;
        }
        if (A == 0) {
            return B;
        }
        return gcd(B,A % B);
    }
    public static void main(String[] args) {
        int A = 30;
        int B = 12;
        System.out.println(cpFact(A,B));
    }
}
