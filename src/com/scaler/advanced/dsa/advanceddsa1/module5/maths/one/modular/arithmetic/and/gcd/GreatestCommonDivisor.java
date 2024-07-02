package com.scaler.advanced.dsa.advanceddsa1.module5.maths.one.modular.arithmetic.and.gcd;

/**
 * Given 2 non-negative integers A and B, find gcd(A, B)
 * GCD of 2 integers A and B is defined as the greatest integer 'g' such that 'g' is a divisor of both A and B. Both A and B fit in a 32 bit signed integer.
 * Note: DO NOT USE LIBRARY FUNCTIONS.
 *
 * Input : A = 4 B = 6 Output : 2
 * Explanation : 2 divides both 4 and 6
 *
 * Input : A = 6 B = 7  Output : 1
 * Explanation : 1 divides both 6 and 7
 */
public class GreatestCommonDivisor {
    public static int gcd(int A, int B) {
        if(B == 0){
            return A;
        }

        return gcd(B,A % B);
    }
    public static void main(String[] args) {
        int A = 4;
        int B = 6;
        System.out.println(gcd(A,B));
    }
}
