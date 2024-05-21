package com.scaler.advanced.dsa.module4.maths.three.prime.numbers;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given an integer A. Find the list of all prime numbers in the range [1, A].
 * Input : A = 7 Output : [2, 3, 5, 7]
 * Explanation:
 * For Input : The prime numbers from 1 to 7 are 2, 3, 5 and 7.
 *
 * Input : A = 12 Output : [2, 3, 5, 7, 11]
 * Explanation:
 * For Input : The prime numbers from 1 to 12 are 2, 3, 5, 7 and 11.
 */
public class FindAllPrimes {
    public static ArrayList<Integer> solve(int A) {
        ArrayList<Integer> resultList = new ArrayList<>();

        for (int i = 2; i <= A ; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i ; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                resultList.add(i);
            }
        }
        return resultList;
    }

    public static ArrayList<Integer> solveUsingSieveOfEratothenes(int A) {
        ArrayList<Integer> resultList = new ArrayList<>();

        return resultList;

    }
    public static void printAllPrimeNumbers(int A){
        for (int i = 2; i<= A ; i++) {
            boolean isPrime = true;

            for (int j = 2; j*j <= i ; j++) {
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i + " ");
            }
        }
    }

    public static void printAllPrimeNumbersUsingSieveOfEratothenes(int A){
        boolean[] isPrime = new boolean[A+1];
        Arrays.fill(isPrime,true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= A ; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= A ; j = j + i) {
                        isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i <= A ; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }

    }
    public static void main(String[] args) {
        int n = 7;
        printAllPrimeNumbers(n);
        System.out.println();
        printAllPrimeNumbersUsingSieveOfEratothenes(n);

        System.out.println();

        //System.out.println(solve(n));
        //System.out.println(solveUsingSieveOfEratothenes(n));

    }
}
