package com.scaler.advanced.dsa.advanceddsa1.module5.arrays.two.dimensional;

public class BoundryElementsOfAMatrix {
    public static void solve(int[][] A) {
        int n = A.length;
        int i = 0;//row index
        int j = 0;//column index

        //Print (n-1) element of Top Row  --> Left To Right
        for (int index = 0;index < n-1;index++) {
            System.out.print(A[i][j]+" ");
            j++;
        }
        //Print (n-1) element of Last Colum --> Top To Bottom
        for (int index = 0;index < n-1;index++) {
            System.out.print(A[i][j]+" ");
            i++;
        }
        //Print (n-1) element of Last Row --> Right To Left
        for (int index = 0;index < n-1;index++) {
            System.out.print(A[i][j]+" ");
            j--;
        }
        //Print (n-1) element of 1st Column --> Bottom To Top
        for (int index = 0;index < n-1;index++) {
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
