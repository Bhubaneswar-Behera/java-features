package com.scaler.advanced.dsa.module4.arrays.two.dimensional;

/**
 * Given a 2D Matrix A of dimensions N*N,
 * we need to return the sum of all possible submatrices.
 * Input : A = [ [1, 1]
 *              [1, 1] ]
 * Output : 16
 *
 * Explanation :
 * Number of submatrices with 1 elements = 4, so sum of all such submatrices = 4 * 1 = 4
 * Number of submatrices with 2 elements = 4, so sum of all such submatrices = 4 * 2 = 8
 * Number of submatrices with 3 elements = 0
 * Number of submatrices with 4 elements = 1, so sum of such submatrix = 4
 * Total Sum = 4+8+4 = 16
 */
public class SumOfAllSubMatrices {

    //Contribution Technique
    public static int solve(int[][] A) {
        int answer = 0;
        int n = A.length;
        int m = A[0].length;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                answer =answer + A[i][j] *(i+1)*(n-i)*(j+1)*(m-j);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[][] A = {{1,1},
                     {1,1}};
        System.out.println(solve(A));
    }
}
