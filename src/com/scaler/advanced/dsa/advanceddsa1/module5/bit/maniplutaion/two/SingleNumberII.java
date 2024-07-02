package com.scaler.advanced.dsa.advanceddsa1.module5.bit.maniplutaion.two;

/**
 * Given an array of integers, every element appears thrice except for one, which occurs once.
 * Find that element that does not appear thrice.
 *
 * NOTE: Your algorithm should have a linear runtime complexity.
 * Could you implement it without using extra memory?
 *
 * Input : A = [1, 2, 4, 3, 3, 2, 2, 3, 1, 1] Output : 4
 *Explanation : 4 occurs exactly once in Input 1.
 *
 * Input : A = [0, 0, 0, 1] Output : 1
 * Explanation : 1 occurs exactly once in Input 2.
 */
public class SingleNumberII {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int singleNumber(final int[] A) {
        int n = A.length;
        int answer = 0;

        for (int i = 0; i < 32 ; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if ((A[j] & (1<<i)) > 0) {
                    count++;
                }
            }
            if (count % 3 == 1) {
                answer = answer | (1<<i);
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 4, 3, 3, 2, 2, 3, 1, 1};
        System.out.println(singleNumber(A));
    }
}
