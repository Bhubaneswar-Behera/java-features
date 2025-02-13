package com.scaler.advanced.dsa.advanceddsa1.module5.arrays.two.dimensional;

/**
 * Given a matrix of integers A of size N x M and an integer B.
 * In the given matrix every row and column is sorted in non-decreasing order. Find and return the position of B in the matrix in the given form:
 * If A[i][j] = B then return (i * 1009 + j)
 * If B is not present return -1.
 *
 * Note 1: Rows are numbered from top to bottom and columns are numbered from left to right.
 * Note 2: If there are multiple B in A then return the smallest value of i*1009 +j such that A[i][j]=B.
 * Note 3: Expected time complexity is linear
 * Note 4: Use 1-based indexing
 *
 *Input
 * A = [[1, 2, 3]           B = 2
 *      [4, 5, 6]
 *      [7, 8, 9]]
 *
 */
public class SearchInARowWiseAnsColumnWiseSortedMatrix {
    public static int solve(int[][] A, int B) {
        int totalNumberOfRows = A.length; //total number of rows
        int totalNumberOfColumns = A[0].length; //total number of columns
        int answer = Integer.MAX_VALUE;
        int row = 0;
        int column = totalNumberOfColumns - 1;

        while(row < totalNumberOfRows && column >= 0){//row can increase the length and column should be greater than equal to first column
            if(A[row][column] == B){
                answer = Math.min(answer,(row +1)*1009 + (column + 1));
            }
            if (A[row][column] < B){//may present in same column so go down (increase the row)
               row++;
            } else {//element is smaller so go left(decrease column)
                column--;
            }
        }
        return answer == Integer.MAX_VALUE ? -1 : answer;
    }

    public static void main(String[] args) {
        int[][] A = {{2,3,6,7},
                    {2,3,4,5}};

        int B = 2;

        System.out.println(solve(A,B));

    }
}
