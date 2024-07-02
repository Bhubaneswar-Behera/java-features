package com.scaler.advanced.dsa.advanceddsa1.module5.maths.two.combinatorics.basics;

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
        // start with 1 consecutive number then 2 consecutive number then 3 consecutive numbers....likewise
        // so we loop till sum of n consecutive numbers is less than or equal to A
        for (int n = 1; (n *(n+1)/2) <= A  ; n++) {
            // we will increase the count of the ans by 1....when ->
            // ( A - sum of n consecutives ) % n == 0 --> then only there will exist a way...{ a way
            // by which sum of those consecutive numbers will be = A }
            if((A - (n*(n+1)/2)) % n == 0){
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
