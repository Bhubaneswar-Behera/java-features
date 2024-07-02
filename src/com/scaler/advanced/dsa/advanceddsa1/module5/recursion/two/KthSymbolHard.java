package com.scaler.advanced.dsa.advanceddsa1.module5.recursion.two;

/**
 * On the first row, we write a 0. Now in every subsequent row,
 * we look at the previous row and replace each occurrence of 0 with 01, and each occurrence of 1 with 10.
 * Given row number A and index B, return the Bth indexed symbol in row A. (The values of B are 0-indexed.).
 *
 * Input 1: A = 3 B = 0     Output : 0
 * Explanation :
 *  Row 1: 0
 *  Row 2: 01
 *  Row 3: 0110
 *
 * Input 2: A = 4 B = 4     Output 2: 1
 * Explanation :
 *  Row 1: 0
 *  Row 2: 01
 *  Row 3: 0110
 *  Row 4: 01101001
 *
 */
public class KthSymbolHard {
    public static int solve(int A, long B) {
        //end condition is at B==0 or A==1, return 0
        if(B == 0) {
            return 0;
        }

        //if even index return same as value at B/2 index in A-1 row
        if(B % 2 == 0) {
            return solve(A-1, B/2);
        }

        //if odd index return compliment of value at B/2 index in A-1 row
        return 1-solve(A-1, B/2);

    }

    public static void main(String[] args) {
        int A = 3;
       int B = 0;
        System.out.println(solve(A,B));
    }
}
