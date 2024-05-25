package com.scaler.advanced.dsa.module4.maths.two.combinatorics.basics;

/**
 * Given three integers A, B, and C, where A represents n, B represents r, and C represents m,
 * find and return the value of nCr % m where nCr % m = (n!/((n-r)!*r!))% m.
 *
 * x! means factorial of x i.e. x! = 1 * 2 * 3... * x.
 *
 * Input : A = 5 B = 2 C = 13
 * Output : 10
 * Explanation : The value of 5C2 % 11 is 10.
 *
 * Input : A = 6 B = 2 C = 13
 * Output : 2
 * Explanation : The value of 6C2 % 13 is 2.
 *
 */
public class ComputeNCRModm {
    public static int solve(int A, int B, int C) {

        int[][] answer = new int[A+1][B+1];


        for (int i = 0; i <=A ; i++) {
            for (int j = 0; j <= Math.min(i,B) ; j++) {
                if (j == 0 || j == i) {
                    answer[i][j] = 1;
                } else {
                    answer[i][j] = (answer[i-1][j-1] + answer[i-1][j])%C;
                }

            }
        }
        return answer[A][B];
    }

    public static void main(String[] args) {
        int A = 5;
        int B = 2;
        int C = 13;
        System.out.println(solve(A,B,C));
    }
}
