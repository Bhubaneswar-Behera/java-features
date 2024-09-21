package com.scaler.advanced.dsa.advanceddsa3.module7.maths.combinatorics.basics;

/**
 * Write a program to print the pascal triangle up to A rows.
 *
 * Input :A = 3
 *  Output :
 *      1 0 0
 *      1 1 0
 *      1 2 1
 *Explanation :
 * Row 1 = 1 0 0
 * Row 2 = 1C0 1C1 0 = 1 1 0
 * Row 3 = 2C0 2C1 2C2 = 1 2 1
 *
 *
 * Input : A = 5
 * Output :
 *      1 0 0 0 0
 *      1 1 0 0 0
 *      1 2 1 0 0
 *      1 3 3 1 0
 *      1 4 6 4 1
 *
 */
public class PascalTriangle {

    public int[][] solve(int A) {
        int[][] ncr = new int[A][A];

        for (int i = 0; i < A; i++) {
            ncr[i][0] = 1;
            ncr[i][i] = 1;
            for (int j = 1; j < i ; j++) {
                ncr[i][j] = ncr[i-1][j-1] + ncr[i-1][j];
                //If mod is needed then do the below
                //ncr[i][j] = (ncr[i-1][j-1] + ncr[i-1][j])%A;
            }
        }
        return ncr;
    }

    public static void main(String[] args) {

    }
}
