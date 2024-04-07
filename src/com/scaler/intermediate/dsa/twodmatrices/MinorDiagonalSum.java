package com.scaler.intermediate.dsa.twodmatrices;

/**
 * You are given a N X N integer matrix.
 * You have to find the sum of all the minor diagonal elements of A.
 * Minor diagonal of a M X M matrix A is a collection of elements A[i, j]
 * such that i + j = M + 1 (where i, j are 1-based).
 *
 * Input : A = {{1, -2, -3},
 *             {-4, 5, -6},
 *             {-7, -8, 9}}
 * Output : -5
 *
 *  Explanation: A[1][3] + A[2][2] + A[3][1] = (-3) + 5 + (-7) = -5
 *
 * Input : A = {{3, 2},
 *              {2, 3}}
 * Output 2 : 4
 * Explanation : A[1][2] + A[2][1] = 2 + 2 = 4
 *
 *
 */
public class MinorDiagonalSum {
    public static int solve(final int[][] A) {
        int n =A.length;
        int answer = 0;

        int i = 0;
        int j = n - 1;

        while (i < n) { //while(j >= 0)
            answer =answer + A[i][j];
            i++;
            j--;
        }

        return answer;
    }
    public static void main(String[] args) {

        int[][] A = {{1, -2, -3},
                    {-4, 5, -6},
                    {-7, -8, 9}};
        System.out.println(solve(A));

    }
}
