package com.scaler.advanced.dsa.module4.arrays.two.dimensional;

import java.util.Arrays;

/**
 * Given an integer A, generate a square matrix filled with elements
 * from 1 to A2 in spiral order and return the generated square matrix.
 * Input : n = 5
 * Output 2:
 *  {{ 1,   2,  3,  4, 5},
 *   {16, 17, 18, 19, 6},
 *   {15, 24, 25, 20, 7},
 *   {14, 23, 22, 21, 8},
 *   { 13, 12, 11, 10, 9] ]
 *
 *
 */
public class SpiralOrderMatrix {
    public static int[][] generateMatrix(int A) {
        int[][] answer = new int[A][A];
        int value = 1;
        int i = 0;
        int j = 0;

        while (A > 1) {
            for (int index = 1; index < A ; index++) {
                  answer[i][j] = value;
                  j++;
                  value++;
            }
            for (int index = 1; index < A ; index++) {
                answer[i][j] = value;
                i++;
                value++;
            }
            for (int index = 1; index < A ; index++) {
                answer[i][j] = value;
                j--;
                value++;
            }
            for (int index = 1; index < A ; index++) {
                answer[i][j] = value;
                i--;
                value++;
            }
            i++;
            j++;
            A = A - 2;
        }
        if(A == 1){
            answer[i][j] = value;
        }

        return answer;
    }

    public static void main(String[] args) {
        int A = 5;

       int result[][] = generateMatrix(A);
       for(int[] a : result){
           System.out.println(Arrays.toString(a) + " " );
       }
    }
}
