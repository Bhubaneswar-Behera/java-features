package com.scaler.advanced.dsa.module4.maths.two.combinatorics.basics;

/**
 * Given a positive integer A.
 * Return the number of ways it can be written as a sum of consecutive positive integers.
 *
 * Input : A = 5 Output : 2
 * Explanation :
 *      The 2 ways are:
 *      => [5]
 *      => [2, 3]
 *
 * Input : A = 15 Output : 4
 * Explanation :
 *      The 4 ways are:
 *      => [15]
 *      => [7, 8]
 *      => [4, 5, 6]
 *      => [1, 2, 3, 4, 5]
 */
public class ConsecutiveNumbersSum {
    public static int solve(int A) {
        int answer = 0;

        for (int i = 1; i < Math.sqrt(2*A) ; i++) {
            int T = A - (i*(i-1))/2;
            if(T % i == 0){
                answer++;
            }
        }

         return answer;
    }
    public static void main(String[] args) {
        int A = 5;
        System.out.println(solve(A));
    }
}
