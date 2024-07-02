package com.scaler.advanced.dsa.advanceddsa1.module5.arrays.two.dimensional;

public class Main {
    public static void solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;

        int i = 0;
        int j = 0;
        //1st Row left to right
        for (int index = 0; index < n -1; index++) {
            System.out.print(A[i][j]+" ");
            j++;
        }
        //Last Column Top to Bottom
        for (int index = 0; index < n -1; index++) {
            System.out.print(A[i][j]+" ");
            i++;
        }

        //Last Row Right to left
        for (int index = 0; index < n -1; index++) {
            System.out.print(A[i][j]+" ");
            j--;
        }

        //1st Column bottom to top
        for (int index = 0; index < n -1; index++) {
            System.out.print(A[i][j]+" ");
           i--;
        }
    }
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3, 4},
                {5, 6, 7,  8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        solve(A);
    }
}
