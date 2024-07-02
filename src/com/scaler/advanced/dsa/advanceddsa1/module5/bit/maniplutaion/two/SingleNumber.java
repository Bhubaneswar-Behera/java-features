package com.scaler.advanced.dsa.advanceddsa1.module5.bit.maniplutaion.two;

/**
 * Given an array of integers A, every element appears twice except for one. Find that integer that occurs once.
 * NOTE: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Input : A = [1, 2, 2, 3, 1] Output : 3
 * Explanation : 3 occurs once.
 *
 * Input : A = [1, 2, 2] Output : 1
 * Explanation : 1 occurs once.
 */
public class SingleNumber {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int singleNumber(final int[] A) {
        int n  = A.length;
        int xor = 0;

        for (int i = 0; i < n; i++) {
            xor = xor ^ A[i];
        }

        return xor;
    }
    public static int singleNumber1(final int[] A) {
        int n = A.length;
        int answer = 0;
        for (int i = 0; i < 32 ; i++) {
            int count = 0;
            for (int j = 0; j < n ; j++) {
                if((A[j] & (1<<i)) > 0){
                    count++;
                }
            }
            if ((count & 1) == 1) {
                answer = answer | (1<<i);
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 2, 3, 1};
        System.out.println(singleNumber(A));
        System.out.println(singleNumber1(A));
    }
}
