package com.scaler.intermediate.dsa.twodmatrices;

import java.util.Arrays;

/**
 * Give 2D matrix mat[n][m], print all the anti diagonals.
 * The vacant spaces in the grid should be assigned to 0.
 *
 * Input:
 * m[3][4] =  {{1, 2,  3,  4},
 *             {5, 6,  7,  8},
 *             {9, 10, 11, 12}}
 * Output:
 *          1 0 0
 *          2 5 0
 *          3 6 9
 *          4 7 10
 *          8 11 0
 *          12 0 0
 *
 *
 */
public class PrintAllAntiDiagonals {

    public static int[][] diagonal(int[][] A) {
        int n = A.length;
        int[][] answer = new int[2*n-1][n];

        for(int c = 0; c < n ;c++){
            int  i = 0;//row
            int  j = c;//column
            while(i < n && j >= 0){
                answer[c][i] = A[i][j];
                i++;
                j--;
            }
        }
        for(int r = 1; r < n  ;r++){
            int  i = r;
            int  j = n - 1;
            while(i < n && j >=0){
                answer[ i + j][i - r] = A[i][j];
                i++;
                j--;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        int[][] A = {{1, 2,  3,  4},
                     {5, 6,  7,  8},
                     {9, 10, 11, 12}};
        int[][] result = diagonal(A);
        for(int[] a : result){
            System.out.println(Arrays.toString(a));
        }
    }
}
