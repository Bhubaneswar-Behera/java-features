package com.scaler.advanced.dsa.advanceddsa1.module5.maths.three.prime.numbers;

public class PrimeNumbers {
    public static boolean checkPrime(int n){
        int count = 0;

        for (int i = 1; i * i <= n  ; i++) {
            if (n % i == 0) {
                count++;
                if (i != n / i) {
                    count++;
                }
            }
        }
        return count == 2;
    }


    public static boolean checkPrimeAnotherApproach(int n){
        if(n < 2){
            return false;
        }
        for (int i = 2; i * i <= n ; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(checkPrime(n));
        System.out.println(checkPrimeAnotherApproach(n));
    }
}
