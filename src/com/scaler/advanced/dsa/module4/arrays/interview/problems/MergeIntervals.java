package com.scaler.advanced.dsa.module4.arrays.interview.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * You have a set of non-overlapping intervals. You are given a new interval [start, end],
 * insert this new interval into the set of intervals (merge if necessary).
 * You may assume that the intervals were initially sorted according to their start times.
 *
 * Input : Given intervals [1, 3], [6, 9] insert and merge [2, 5] .
 * Output : [ [1, 5], [6, 9] ]
 * Explanation : (2,5) does not completely merge the given intervals
 *
 * Input : Given intervals [1, 3], [6, 9] insert and merge [2, 6] .
 * Output : [ [1, 9] ]
 * Explanation : (2,6) completely merges the given intervals
 */
public class MergeIntervals {
    public static int[][] insert(int[][] A, int[] B) {
        List<int[]> result = new ArrayList<>();

        int i = 0;
        // Add all intervals ending before new interval starts
        while (i < A.length && A[i][1] < B[0]) {
            result.add(A[i]);
            i++;
        }

        // Merge intervals overlapping with new interval
        while (i < A.length && A[i][0] <= B[1]) {
            B[0] = Math.min(A[i][0], B[0]);
            B[1] = Math.max(A[i][1], B[1]);
            i++;
        }
        result.add(B);

        // Add remaining intervals
        while (i < A.length) {
            result.add(A[i]);
            i++;
        }

        return result.toArray(new int[result.size()][]);
    }
    public static void main(String[] args) {
        int[][] intervals1 = { {1, 3}, {6, 9} };
        int[] newInterval1 = {2, 5};
        int[][] mergedIntervals = insert(intervals1, newInterval1);
        for (int[] a : mergedIntervals) {
            System.out.println(Arrays.toString(a));
        }

    }
}
