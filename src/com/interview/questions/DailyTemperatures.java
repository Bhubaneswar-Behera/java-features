package com.interview.questions;

import java.util.Arrays;
import java.util.Stack;

/**
 * Wells Fargo - 23-March-2024
 * Leetcode: 739
 * Given an array of integers, that represent temperature.
 * find the number of days after which we get a higher temperature.
 *
 * Input :  {73,74,75,71,69,72,76,73}
 * Output : {1,1,4,2,1,1,0,0}
 *
 *
 */

public class DailyTemperatures {
    public static int[] solve(int[] A){
        int n = A.length;
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[n];

        for (int i = n - 1; i >= 0 ; i--) {
            //popping all indices with  lower or equal
            //temperature that the current index
            while (!stack.empty() && A[i] >= A[stack.peek()]) {
                stack.pop();
            }

            //If the stack still has elements
            //then the next warmer temperature exists
            if(!stack.empty()){
                result[i] = stack.peek() - i;
            }

            //Inserting current index in the stack
            stack.push(i);
        }

        return result;

    }
    public static void main(String[] args) {
        int[] A = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(solve(A)));
    }
}
