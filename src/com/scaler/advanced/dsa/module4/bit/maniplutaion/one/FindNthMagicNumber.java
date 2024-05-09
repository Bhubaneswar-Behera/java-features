package com.scaler.advanced.dsa.module4.bit.maniplutaion.one;

/**
 * Given an integer A, find and return the Ath magic number.
 * A magic number is defined as a number that can be expressed as a power of 5 or a sum of unique powers of 5.
 * First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), ….
 *
 * Example
 * Input : A = 3 Output : 30
 * Explanation :
 * Magic Numbers in increasing order are [5, 25, 30, 125, 130, ...]
 * 3rd element in this is 30
 *
 * Input : A = 10 Output : 650
 * Explanation 2:
 * In the sequence shown in explanation 1, 10th element will be 650.
 */
public class FindNthMagicNumber {

    public static int solve(int A) {
        int answer = 0;
        int power = 5;

        while (A > 0) {
            if(((A&1) > 0)){
                answer = answer + power;
            }

            power = power * 5;
            A = A>>1;
        }


        return answer;
    }
    public static void main(String[] args) {
        int A = 3;
        System.out.println(solve(A));
    }
}
