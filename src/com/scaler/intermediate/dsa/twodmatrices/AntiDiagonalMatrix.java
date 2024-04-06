package com.scaler.intermediate.dsa.twodmatrices;

/**
 * Given n*n matrix (mat[n][n]) square matrix.
 * Print the anti-diagonal elements.
 * Input :
 *       int[][] matrix = {{1,5,8},
 *                         {4,3,1},
 *                         {6,5,2}};
 *    Output : 1,3,2
 *
 */
public class AntiDiagonalMatrix {

    public static void printAntiDiagonalBrute(int[][] matrix){
        int n = matrix.length;
        int i = 0;
        int j = n - 1 ;
        while(i < n){
            System.out.print(matrix[i][j] + " ");
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 5, 8},
                          {4, 3, 1},
                          {6, 5, 2}};
        printAntiDiagonalBrute(matrix);

    }
}
