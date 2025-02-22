package com.scaler.advanced.dsa.advanceddsa3.module7.stacks2;

import java.util.Arrays;
import java.util.Stack;

/**
 * Given an array A, find the next greater element G[i] for every element A[i] in the array.
 * The next greater element for an element A[i] is the first greater element on the right side of A[i] in the array, A.
 *
 * More formally:
 *
 * G[i] for an element A[i] = an element A[j] such that
 *     j is minimum possible AND
 *     j > i AND
 *     A[j] > A[i]
 * Elements for which no greater element exists, consider the next greater element as -1.
 *
 * Example  :
 * Input : A = [4, 5, 2, 10] Output : [5, 10, 10, -1]
 * Explanation :
 * For 4, the next greater element towards its right is 5.
 * For 5 and 2, the next greater element towards their right is 10.
 * For 10, there is no next greater element towards its right.
 *
 *
 * Input : A = [3, 2, 1]  Output : [-1, -1, -1]
 * Explanation :
 * As the array is in descending order, there is no next greater element for all the elements.
 *
 */
public class NextGreater {

    public static int[] nextGreater(int[] A) {
        int n = A.length;
        int[] G = new int[n]; // Array to store the result
        Stack<Integer> stack = new Stack<>();

        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Remove elements from the stack while the top is less than or equal to the current element
            while (!stack.isEmpty() && stack.peek() <= A[i]) {
                stack.pop();
            }

            // If stack is empty, it means there is no greater element to the right
            if (stack.isEmpty()) {
                G[i] = -1;
            } else {
                G[i] = stack.peek(); // The next greater element is at the top of the stack
            }

            // Push the current element onto the stack
            stack.push(A[i]);
        }

        return G;
    }
    public static void main(String[] args) {
        int[] A = {4, 5, 2, 10};
        System.out.println(Arrays.toString(nextGreater(A)));
    }
}
