package com.scaler.advanced.dsa.module5.contest;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimesinARange {

    public static  ArrayList<Integer> solve(int A, int B) {
        boolean[] isPrime = new boolean[B + 2];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        ArrayList<Integer> resultList = new ArrayList<>();

        for (int p = 2; p * p <= B; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= B; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        for (int p = A; p <= B; p++) {
            if (isPrime[p]) {
                resultList.add(p);
            }
        }
        return resultList;
    }


    public static void main(String[] args) {
        System.out.println(solve(1,5));
    }
}
