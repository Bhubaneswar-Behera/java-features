package com.scaler.advanced.dsa.advanceddsa1.module5.arrays.interview.problems;

/**
 * Given an integer A, find and return the total number of digit 1 appearing
 * in all non-negative integers less than or equal to A.
 *
 *
 * Input : A = 10 Output : 2
 * Explanation : Digit 1 appears in 1 and 10 only and appears one time in each. So the answer is 2.
 *
 * Input : A = 11 Output : 4
 *Explanation : Digit 1 appears in 1(1 time) , 10(1 time) and 11(2 times) only. So the answer is 4.
 */
public class NumberOfDigitOne {

    public static int solve(int A) {

        if (A==0)  {
            return 0;
        }

        int answer = 0;
        int i = 1;
        while(A / i > 0) {
            answer = answer +  (A /(i*10)) * i + Math.min(Math.max((A % (i * 10))- (i-1), 0), i);
            i = i * 10;
        }

        return answer;
    }
    public static void main(String[] args) {
        int A = 11;
        System.out.println(solve(A));
    }
}
