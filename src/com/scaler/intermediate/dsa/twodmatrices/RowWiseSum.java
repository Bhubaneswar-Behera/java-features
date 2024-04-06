package com.scaler.intermediate.dsa.twodmatrices;

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
    public static void solution(int[][] matrix){
        int n = matrix.length;

        for(int i = 0 ; i< n;i++){
            int sum = 0;
            for(int j = 0;j <matrix[i].length;j++){
                sum = sum + matrix[i][j];
            }
            System.out.print(sum+" ");
        }
    }
    public static void main(String[] args) {
       int[][] matrix = {{1,2,3,4},
                         {5,6,7,8},
                        {9,10,11,12}};
        solution(matrix);
    }
}
