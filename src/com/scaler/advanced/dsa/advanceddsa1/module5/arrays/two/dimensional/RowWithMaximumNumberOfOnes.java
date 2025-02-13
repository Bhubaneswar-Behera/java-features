package com.scaler.advanced.dsa.advanceddsa1.module5.arrays.two.dimensional;

/**
 * Given a binary sorted matrix A of size N x N.
 * Find the row with the maximum number of 1.
 *
 * NOTE:
 *
 * If two rows have the maximum number of 1 then return the row which has a lower index.
 * Rows are numbered from top to bottom and columns are numbered from left to right.
 * Assume 0-based indexing.
 * Assume each row to be sorted by values.
 * Expected time complexity is O(rows + columns).
 *
 * Input : A = [[0, 1, 1]         Output : 0
 *              [0, 0, 1]
 *              [0, 1, 1]]
 *
 * Explanation : Row 0 has maximum number of 1s.
 */
public class RowWithMaximumNumberOfOnes {
    public static int solve(int[][] A) {
        int totalNumberOfRows = A.length;
        int totalNumberOfColumns = A[0].length;
        int answer = 0;
        //Start from right top position that is row number 0 and totalNumberOfColumns - 1
        int row = 0;
        int column = totalNumberOfColumns - 1;

        while (row < totalNumberOfRows && column >= 0) {
            if (A[row][column] == 0){
                row++;//move to the next row that is go down
            } else {//we found 1
                answer = row;//current i is the max number of 1's
                column--;//move one column left
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] A = {{0,1,1},
                     {0,0,1},
                     {0,1,1}};
        System.out.println(solve(A));
    }
}
