package com.scaler.intermediate.dsa.interview.problems;

import java.util.*;

/**
 * You are given a 2D integer matrix A, make all the elements in a row or column zero if the A[i][j] = 0.
 * Specifically, make entire ith row and jth column zero.
 *
 * Problem Constraints
 * 1 <= A.size() <= 103
 * 1 <= A[i].size() <= 103
 * 0 <= A[i][j] <= 103
 *
 * Input :
 * [1,2,3,4]
 * [5,6,7,0]
 * [9,2,0,4]
 *
 * Output :
 * [1,2,0,0]
 * [0,0,0,0]
 * [0,0,0,0]
 *
 * Explanation :
 * A[2][4] = A[3][3] = 0, so make 2nd row, 3rd row,
 * 3rd column and 4th column zero.
 */
public class RowToColumnZero {

    public static int[][] solve(int[][] A) {
        int row = A.length;
        int column = A[0].length;
        int[][] answer = new int[row][column];

        for(int i =0; i<row; i++) {
            for(int j =0; j < column; j++) {
                if(A[i][j] == 0) {
                    convertMatrixToNonZero(i,j, answer);
                }
            }
        }

        for(int i =0; i< A.length; i++) {
            for(int j =0; j < A[0].length; j++) {
                if(answer[i][j] != -1) {
                    answer[i][j] = A[i][j];
                }
                else {
                    answer[i][j] = 0;
                }
            }
        }
        return answer;
    }

    public static void convertMatrixToNonZero(int row, int column, int[][] ans) {
        for(int i = 0; i < ans[row].length; i++ ) {
            ans[row][i] = -1;
        }
        for(int j =0; j<ans.length; j++) {
            ans[j][column] = -1;
        }
    }

    public static int[][] solve1(int[][] A) {
        int m = A.length;
        int n = A[0].length;

        HashSet<Integer> rowHashSet = new HashSet<>();
        HashSet<Integer> columnHashSet = new HashSet<>();

        for(int row=0; row < m; row++)
        {
            for(int col=0; col < n; col++)
            {
                if(A[row][col]==0)
                {
                    rowHashSet.add(row);
                    columnHashSet.add(col);
                }
            }
        }


        Iterator<Integer> rowIter = rowHashSet.iterator();
        while(rowIter.hasNext())
        {
            int thisRow = rowIter.next();
            for(int col=0; col < n; col++)
            {
                A[thisRow][col] = 0;
            }
        }

        Iterator<Integer> colIter = columnHashSet.iterator();
        while(colIter.hasNext())
        {
            int thisCol=colIter.next();
            for(int row=0; row < m; row++)
            {
                A[row][thisCol] = 0;
            }
        }


        return A;
    }
    public static void main(String[] args) {
        int[][] A = {{1,2,3,4},
                    {5,6,7,0},
                    {9,2,0,4}};

        int[][] outputArrayBrute = solve1(A);
        for(int[] a : outputArrayBrute){
            System.out.println(Arrays.toString(a));
        }


        System.out.println();
        int[][] A1 = {{1,2,3,4},
                {5,6,7,0},
                {9,2,0,4}};
        int[][] outputArray = solve1(A1);
        for(int[] a : outputArray){
            System.out.println(Arrays.toString(a));
        }
    }
}
