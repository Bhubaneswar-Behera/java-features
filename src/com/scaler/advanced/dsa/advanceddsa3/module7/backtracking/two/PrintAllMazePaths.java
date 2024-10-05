package com.scaler.advanced.dsa.advanceddsa3.module7.backtracking.two;

import java.util.ArrayList;

/**
 * You are given the dimensions of a rectangular board of size A x B.
 * You need to print all the possible paths from top-left corner to bottom-right corner of the board.
 * You can only move down (denoted by 'D')
 * or right (denoted by 'R') at any point in time.
 *
 * NOTE : You need to return all the paths in Lexicographically
 * sorted order.
 * A lexicographic order is an arrangement of characters in alphabetical order.
 *
 *Problem Constraints : 1 <= A, B <= 8
 *
 * Input : A = 3 , B = 2  Output  :  DDR DRD RDD
 * Explanation :
 * The size of the matrix is 3x2.
 * You are currently standing at (0, 0), the possible paths to bottom right cell (2, 1) are :
 * - (0, 0) -> (1, 0) -> (2, 0) -> (2, 1)  which corresponds to DDR
 * - (0, 0) -> (1, 0) -> (1, 1) -> (2, 1)  which corresponds to DRD
 * - (0, 0) -> (0, 1) -> (1, 1) -> (2, 1)  which corresponds to RDD
 *
 * NOTE: Printing DRD, RDD before DDR would be incorrect as the output should be given in Lexicographical order.
 *
 *
 * Input : A = 1 , B = 2  Output  :  R
 * Explanation :
 *  The size of the matrix is 1x2.
 *  You are currently standing at (0, 0), the possible paths to bottom right cell (0, 1) are :
 *  - (0, 0) -> (0, 1)  which corresponds to R
 *  This is the only possible path.
 *
 */
public class PrintAllMazePaths {
    public ArrayList<String> PrintAllPaths(int A, int B) {
        ArrayList<String> result = new ArrayList<>();
        StringBuilder currentPath = new StringBuilder();
        backtrack(0, 0, A, B, currentPath, result);
        return result;
    }
    // Backtracking function to generate all paths
    private void backtrack(int row, int col, int A, int B, StringBuilder currentPath, ArrayList<String> result) {
        // If we have reached the bottom-right corner, add the current path
        if (row == A - 1 && col == B - 1) {
            result.add(currentPath.toString());
            return;
        }

        // Move Right (R) if possible
        if (col < B - 1) {
            currentPath.append('R');
            backtrack(row, col + 1, A, B, currentPath, result);
            currentPath.deleteCharAt(currentPath.length() - 1); // Backtrack
        }

        // Move Down (D) if possible
        if (row < A - 1) {
            currentPath.append('D');
            backtrack(row + 1, col, A, B, currentPath, result);
            currentPath.deleteCharAt(currentPath.length() - 1); // Backtrack
        }
    }
    public static void main(String[] args) {

    }
}
