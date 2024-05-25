package com.scaler.advanced.dsa.module4.maths.one.modular.arithmetic.and.gcd;

/**
 * (a^b % m)
 *
 */
public class FastPower {
    public static int fastPower(int a , int b, int m) {
        if (b == 0) {
            return 1;
        }
        int halfPower = fastPower(a,b/2,m);

        if (b % 2  == 0) {
            return (halfPower * halfPower) % m;
        }
        return ((halfPower * halfPower) % m * (a%m))%m;
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int m = 2;
        System.out.println(fastPower(a,b,m));
    }
}
