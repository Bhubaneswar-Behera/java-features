package com.scaler.intermediate.dsa.twodmatrices;

import java.util.Arrays;

/**
 * You are given two matrices A & B of same size, you have to return another matrix which is the sum of A and B.
 * Note: Matrices are of same size means the number of rows and number of columns of both matrices are equal.
 *
 * Input :
 * A = [[1, 2, 3],
 *      [4, 5, 6],
 *      [7, 8, 9]]
 *
 * B = [[9, 8, 7],
 *      [6, 5, 4],
 *      [3, 2, 1]]
 *
 * Output :
 * [[10, 10, 10],
 *  [10, 10, 10],
 *  [10, 10, 10]]
 *
 *  Explanation :
 * A + B = [[1+9, 2+8, 3+7],
 *          [4+6, 5+5, 6+4],
 *          [7+3, 8+2, 9+1]]
 *       = [[10, 10, 10],
 *          [10, 10, 10],
 *          [10, 10, 10]].
 *
 */
public class AddTheMatrices {
    public static int[][] solve(int[][] A, int[][] B) {
        int n = A.length;
        int c = A[0].length;
        int[][] answer = new int[n][c];

        for (int i = 0;i < n;i++){
            for(int j = 0;j < c;j++){
                answer[i][j] = A[i][j] + B[i][j];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3},
                    {4, 5, 6},
                        {7, 8, 9}};

        int[][] B = {{9, 8, 7},
                    {6, 5, 4},
                    {3, 2, 1}};

        int[][] result = solve(A,B);
        for(int[] a : result){
            System.out.println(Arrays.toString(a));
        }

    }
}
