package com.scaler.advanced.dsa.advanceddsa1.module5.maths.three.prime.numbers;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A lucky number is a number that has exactly 2 distinct prime divisors.
 * You are given a number A, and you need to determine the count of lucky numbers between the range 1 to A (both inclusive).
 *
 * Input : A = 8 Output : 1
 * Explanation :
 * Between [1, 8] there is only 1 lucky number i.e 6.
 * 6 has 2 distinct prime factors i.e 2 and 3.
 *
 * Input : A = 12 Output : 3
 * Explanation : Between [1, 12] there are 3 lucky number: 6, 10 and 12.
 */
public class LuckyNumbers {
    public static int solveBruteForce(int A) {
        int answer  = 0;

        for (int i = 1; i <= A ; i++) {
            int count = 0;
            for (int j = 1; j <= A ; j++) {
                if (checkPrime(j) && i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                answer++;
            }
        }
        return answer;
    }

    public static boolean checkPrime(int n){
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

    public static int solve(int A) {
        int answer = 0;

        boolean[] isPrimeArray = new boolean[A+1];
        Arrays.fill(isPrimeArray,true);
        for(int i = 2; i * i < isPrimeArray.length;i++){
            if(isPrimeArray[i]==true){
                for(int j =i * i;j < isPrimeArray.length;j=j+i){
                    isPrimeArray[j]=false;
                }
            }
        }

        ArrayList<Integer> primeList = new ArrayList<>();
        for(int i=2; i < isPrimeArray.length; i++){
            if(isPrimeArray[i]){
                primeList.add(i);
            }
        }

        for(int i=2; i<=A; i++){
            int count = 0;
            for(int j = 0; j< primeList.size(); j++){
                if(i % primeList.get(j) == 0){
                    count++;
                }
            }

            if(count == 2){
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int A = 8;
        System.out.println(solveBruteForce(A));
        System.out.println(solve(A));

    }
}
