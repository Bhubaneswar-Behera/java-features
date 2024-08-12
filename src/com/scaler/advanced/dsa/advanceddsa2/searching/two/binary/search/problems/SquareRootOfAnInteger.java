package com.scaler.advanced.dsa.advanceddsa2.searching.two.binary.search.problems;

/**
 * Given an integer A. Compute and return the square root of A.
 * If A is not a perfect square, return floor(sqrt(A)).
 *
 * NOTE:
 *    The value of A*A can cross the range of Integer.
 *    Do not use the sqrt function from the standard library.
 *    Users are expected to solve this in O(log(A)) time.
 *
 * Input : 11  Output : 3
 * Explanation :
 * When A = 11 , square root of A = 3.316. It is not a perfect square so we return the floor which is 3.
 *
 * Input : 9   Output : 3
 * Explanation :
 * When A = 9 which is a perfect square of 3, so we return 3.
 */
public class SquareRootOfAnInteger {
    public static int sqrt(int A) {
        if (A == 0 ) {
            return 0;
        }
        int l = 1;
        int h = A;
        int answer = -1;
        while (l <= h){
            int mid = l + (h-l)/2;

            if (1L * mid * mid <= A) {
                answer = mid;
                l = mid  + 1;
            } else {
                h = mid - 1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int A = 50;
        System.out.println(sqrt(A));
    }
}
