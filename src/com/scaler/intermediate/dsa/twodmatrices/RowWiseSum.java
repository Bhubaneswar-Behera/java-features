package com.scaler.intermediate.dsa.twodmatrices;

import java.util.Arrays;

/**
 * Given an 2D matrix mat[n][m], print the row-wise sum.
 *
 * m[3][4] = {{1,2,3,4},
 *             {5,6,7,8},
 *            {9,10,11,12}}
 *  Output: 10 26 42
 * Explanation :
 *      1+2+3+4 = 10, 5+6+7+8=26,9+10+11+12 = 42
 *
 */
public class RowWiseSum {

    public static int[] solve(int[][] A) {
        int n = A.length;
        int column  = A[0].length;
        int[] result = new int[n];

        for(int i = 0 ;i< n ;i++){
            int sum = 0;
            for (int j = 0; j < column;j++) {
                sum =sum + A[i][j];
            }
            result[i] = sum;
        }
        return result;
    }
    public static void main(String[] args) {
       int[][] A = {{1,2,3,4},
                    {5,6,7,8},
                   {9,10,11,12}};

        System.out.println(Arrays.toString(solve(A)));
    }
}
