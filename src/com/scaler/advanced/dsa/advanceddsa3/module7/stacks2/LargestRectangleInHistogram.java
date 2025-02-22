package com.scaler.advanced.dsa.advanceddsa3.module7.stacks2;

import java.util.Stack;

/**
 * Given an array of integers A.
 * A represents a histogram i.e A[i] denotes the height of the ith histogram's bar. Width of each bar is 1.
 * Find the area of the largest rectangle formed by the histogram.
 *
 * Input : A = [2, 1, 5, 6, 2, 3] Output : 10
 * Explanation : The largest rectangle has area = 10 unit. Formed by A[3] to A[4].
 *
 * Input : A = [2]  Output : 2
 * Explanation : Largest rectangle has area 2.
 */
public class LargestRectangleInHistogram {
    public static int largestRectangleArea(int[] A) {
        int n = A.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            // While the current bar is shorter than the bar at stack's top, calculate area
            while (!stack.isEmpty() && A[stack.peek()] > A[i]) {
                int height = A[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            // Push the current bar's index to the stack
            stack.push(i);
        }

        // Compute area for remaining bars in the stack
        while (!stack.isEmpty()) {
            int height = A[stack.pop()];
            int width = stack.isEmpty() ? n : n - stack.peek() - 1;
            maxArea = Math.max(maxArea, height * width);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] A = {2, 1, 5, 6, 2, 3};
        System.out.println(largestRectangleArea(A));
    }
}
