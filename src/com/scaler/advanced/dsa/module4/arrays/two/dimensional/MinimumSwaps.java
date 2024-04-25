package com.scaler.advanced.dsa.module4.arrays.two.dimensional;

/**
 * Given an array of integers A and an integer B, find and return the minimum number of swaps
 * required to bring all the numbers less than or equal to B together.
 *
 * Note: It is possible to swap any two elements, not necessarily consecutive.
 *
 * Input: A = [1, 12, 10, 3, 14, 10, 5]  B = 8
 * Output : 2
 *
 * Explanation : A = [1, 12, 10, 3, 14, 10, 5]
 *  After swapping  12 and 3, A => [1, 3, 10, 12, 14, 10, 5].
 *  After swapping  the first occurence of 10 and 5,
 *  A => [1, 3, 5, 12, 14, 10, 10].Now, all elements less than or equal to 8 are together.
 */

public class MinimumSwaps {
    public static int solve(int[] A, int B) {
        int n = A.length;
        int answer = 0;
        int goodNumbers  = 0; // less than B numbers
        for (int a : A) {
            if(a <= B){
                goodNumbers++;
            }
        }
        if(goodNumbers <= 1){
            return 0;
        } else{
            int l = 0;
            int r = 0;
            int badNumbersInCurrentWindow = 0;
            while (r < goodNumbers) { //bad numbers in Current Window
                if (A[r] > B) {
                    badNumbersInCurrentWindow++;
                }
                r++;
            }
            answer = badNumbersInCurrentWindow;
            while (r < n) {
                if (A[l] > B) {
                    badNumbersInCurrentWindow--;
                }
                if (A[r] > B) {
                    badNumbersInCurrentWindow++;
                }
                answer = Math.min(answer, badNumbersInCurrentWindow);
                l++;
                r++;
            }
            }

        return answer;
    }
    public static void main(String[] args) {
        int[] A = {1, 12, 10, 3, 14, 10, 5};
        int B = 8;
        System.out.println(solve(A,B));
    }
}
