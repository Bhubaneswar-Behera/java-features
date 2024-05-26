package com.scaler.advanced.dsa.module4.maths.three.prime.numbers;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given an even number A ( greater than 2 ), return two prime numbers whose sum will be equal to the given number.
 * If there is more than one solution possible, return the lexicographically smaller solution.
 *
 * If [a, b] is one solution with a <= b, and [c,d] is another solution with c <= d, then
 * [a, b] < [c, d], If a < c OR a==c AND b < d.
 * NOTE: A solution will always exist. Read Goldbach's conjecture.
 *
 * Input : 4 Output : [2, 2]
 * Explanation : There is only 1 solution for A = 4.
 */
public class PrimeSum {
    public static ArrayList<Integer> primesum(int A) {
        boolean[] isPrimes = new boolean[A+1];
        Arrays.fill(isPrimes,true);
        isPrimes[0] = false;
        isPrimes[1] = false;

        for(int i=2;i<=Math.sqrt(A);i++)
        {
            if(isPrimes[i]==true)
            {
                for(int j=i*i;j<=A;j=j+i)
                {
                    isPrimes[j] = false;
                }
            }
        }

        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=2;i<isPrimes.length-1;i++)
        {
            if(isPrimes[i] && isPrimes[A-i])
            {
                answer.add(i);
                answer.add(A-i);
                break;
            }
        }

        return answer;

    }


    public static void main(String[] args) {
        int n = 4;
        System.out.println(primesum(n));
    }
}
