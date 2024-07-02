package com.scaler.advanced.dsa.advanceddsa1.module5.maths.three.prime.numbers;

/**
 * Given n , return the smallest prime factor for each number from 2 to n.
 * Input n  = 10 --> {2,3,4,5,6,7,8,9,10}
 * Output :          {2,3,2,5,2,7,2,3,2 }
 *
 */

import java.util.Arrays;

public class SmallestPrimeFactor {
    public static int[] smallestPrimeFactor(int n){
        int[] spf = new int[n+1];

        for (int i = 2; i <= n ; i++) {
            spf[i] = i;
        }

        for (int i = 2; i * i <= n ; i++) {
            if (spf[i] == i) {
                for (int j = i * i; j <= n ; j = j + i) {
                  if (spf[j] == j) {
                      spf[j] = i;
                  }
                }
            }
        }


        return spf;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Arrays.toString(smallestPrimeFactor(n)));
    }
}
