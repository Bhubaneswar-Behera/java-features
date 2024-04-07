package com.scaler.intermediate.dsa.twodmatrices;

import java.util.Arrays;

/**
 * You are given a matrix A and and an integer B,
 * you have to perform scalar multiplication of matrix A with an integer B.
 *
 * Input 1:
 *   A =    [[1, 2, 3],
 *          [4, 5, 6],
 *          [7, 8, 9]]
 *   B = 2
 * Output :
 *          [[2, 4, 6],
 *          [8, 10, 12],
 *          [14, 16, 18]]
 *
 * Explanation :
 * ==> ( [[1, 2, 3],[4, 5, 6],[7, 8, 9]] ) * 2
 *
 * ==> [[2*1, 2*2, 2*3],
 *      [2*4, 2*5, 2*6],
 *      [2*7, 2*8, 2*9]]
 *
 * ==> [[2,   4,  6],
 *      [8,  10, 12],
 *      [14, 16, 18]]
 */
public class MatrixScalarProduct {
    public static int[][] solve(int[][] A, int B) {
        int n = A.length;
        int c = A[0].length;

        for (int i = 0 ; i < n ; i++){
            for (int j = 0;j < c; j++){
                A[i][j] = A[i][j]*B;
            }
        }
        return A;
    }
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}};
        int B = 2;

        int[][] result = solve(A,B);
        for(int[] a :result){
            System.out.println(Arrays.toString(a));
        }
    }
}
