package com.scaler.advanced.dsa.advanceddsa2.module6.searching.one.binary.seacrh.on.array;

/**
 * Given an integer A representing the number of square blocks. The height of each square block is 1. The task is to create a staircase of max-height using these blocks.
 * The first stair would require only one block, and the second stair would require two blocks, and so on.
 * Find and return the maximum height of the staircase.
 *
 * Input : A = 10  Output : 4
 * Explanation : The stairs formed will have height 1, 2, 3, 4.
 *
 * Input : A = 20  Output : 5
 * Explanation : The stairs formed will have height 1, 2, 3, 4, 5.
 */
public class MaximumHeightOfStaircase {

    public static int solve(int A) {
        int sum = 0;
        int count = 0;
        for(int i=1; i<=A; i++)
        {
            sum += i;
            if(A-sum >= 0)
            {
                count++;
            }
            else {
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int A = 10;
        System.out.println(solve(A));
    }
}
