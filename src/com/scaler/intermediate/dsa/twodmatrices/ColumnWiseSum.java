package com.scaler.intermediate.dsa.twodmatrices;

import java.util.Arrays;

/**
 * Given an 2D matrix mat[n][m], print the column-wise sum.
 *
 * m[3][4] = {{1, 2,  3,  4},
 *            {5, 6,  7,  8},
 *            {9, 10, 11, 12}}
 *  Output: 15 18 21 24
 * Explanation :
 *      1+5+9 = 15, 2+6+10=28,3+7+11= 21, 4+8+12 =24
 *
 */
public class ColumnWiseSum {

    public static void solution(int[][] matrix){
        int rows = matrix.length;
        int columns= matrix[0].length;

        for(int i = 0; i < columns;i++){
            int sum = 0;
            for(int j = 0;j < rows;j++){
                sum = sum + matrix[j][i];
            }
            System.out.print(sum + " ");
        }
    }

    public static int[] solve(int[][] A) {
        int row = A.length;
        int column = A[0].length;
        int[] answer = new int[column];

        for(int i = 0; i< column;i++){
            int sum = 0;
            for(int j = 0 ;j < row;j++){
                sum = sum + A[j][i];
            }
            answer[i] = sum;
        }
        return answer;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 2,  3,  4},
                          {5, 6,  7,  8},
                          {9, 10, 11, 12}};
        solution(matrix);
        System.out.println();
        System.out.println(Arrays.toString(solve(matrix)));
    }
}
