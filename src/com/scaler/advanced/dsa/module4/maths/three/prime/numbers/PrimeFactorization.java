package com.scaler.advanced.dsa.module4.maths.three.prime.numbers;

/**
 * n = 48
 *  48 = 2*2*2*2*3 = 2^4 * 3 ^1
 *   = (4+1 ) * (1+1) = 5 * 2  = 10 divisors
 *
 */
public class PrimeFactorization {

    public static int factors(int n){
        int answer = 1;
        int s = smallestPrimeFactor(n)[n];

        while (n > 1) {
            int count = 0;
            while (n % s == 0) {
                n = n / s;
                count++;
            }
            answer = answer * (count + 1);
            s = smallestPrimeFactor(n)[n];
        }

        return answer;
    }

    public static int[] smallestPrimeFactor(int n){
        int[] spf = new int[n+1];
        for (int i = 2; i <= n ; i++) {
            spf[i] = i;
        }

        for (int i = 2; i * i <= n ; i++) {
            if (spf[i] == i) {
                for (int j = i*i; j <=n ; j = j + i) {
                    if (spf[j] == j) {
                        spf[j] = i;
                    }
                }
            }
        }
        return spf;
    }
    public static void main(String[] args) {
        int n = 48;
        System.out.println(factors(n));
    }
}
