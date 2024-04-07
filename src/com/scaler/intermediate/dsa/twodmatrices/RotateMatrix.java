package com.scaler.intermediate.dsa.twodmatrices;

import java.util.Arrays;

/**
 * You are given a n x n 2D matrix A representing an image.
 * Rotate the image by 90 degrees (clockwise).
 * You need to do this in place.
 *Note: If you end up using an additional array, you will only receive partial score.
 *
 * Example Input:
 *   [
 *     [1, 2],
 *     [3, 4]
 *   ]
 *
 *   Output :
 *   [
 *     [3, 1],
 *     [4, 2]
 *  ]
 * Input :
 *  [
 *     [1, 2, 3],
 *     [4, 5, 6],
 *     [7, 8, 9]
 *  ]
 *  Output :
 *       [
 *       [7, 4, 1],
 *       [8, 5, 2],
 *       [9, 6, 3]
 *    ]
 *
 */
public class RotateMatrix {

    public static void solve(int[][] A) {
        int n = A.length;
       //Transpose
        for(int i = 1;i < n; i++){
            for(int j = 0;j < i; j++){
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }

        //reverse
        for(int column = 0;column < n;column++){
           int i = 0;
           int j  = n - 1;
           while (i < j) {
               int temp =A[column][i];
               A[column][i] = A[column][j];
               A[column][j] = temp;
               i++;
               j--;
           }
        }

    }


    public void solve1(int[][] A) {
        int n=A.length;
        //Transposing the matrix in SC=O(1)
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                int temp=A[i][j];
                A[i][j]=A[j][i];
                A[j][i]=temp;
            }
        }
        //reversing each row;
        for(int c=0;c<n;c++){
            int i=0,j=n-1;
            while(i<j){
                int temp=A[c][i];
                A[c][i]=A[c][j];
                A[c][j]=temp;
                i++;j--;
            }
        }
    }



    public static void reverse(int[] A){
        int n = A.length;
        int j = n -1;
        for(int i =0 ;i < n/2;i++){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
    }

    public static int[][] transpose(int[][] A) {
        int n = A.length;
        int[][] answer = new int[n][n];
        for(int i = 0 ; i < n ;i++){
            for (int j = 0;j < i ;j++) {
                answer[j][i] = A[i][j];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[][] A = {{1, 2},
                     {3, 4}};
        solve(A);

    }
}
