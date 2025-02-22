package com.scaler.advanced.dsa.advanceddsa3.module7.stacks1;

import java.util.Stack;

/**
 * Given an expression string A, examine whether the pairs and the orders of “{“,”}”, ”(“,”)”, ”[“,”]”
 * are correct in A.
 * Refer to the examples for more clarity.
 *
 * Input : A = {([])}  Output : 1
 * Input : A = (){     Output : 0
 * Input : A = ()[]    Output : 1
 *
 * Explanation :
 * You can clearly see that the first and third case contain valid paranthesis.
 * In the second case, there is no closing bracket for {, thus the paranthesis sequence is invalid.
 */
public class BalancedParanthesis {
    public static int solve(String A) {
        Stack<Character> stack = new Stack<>();

        for (char c : A.toCharArray()) {
            // Push opening brackets onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // Check for matching closing brackets
            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            }
            else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            }
            else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }
            else {
                // If it doesn't match, return false
                return 0;
            }
        }

        // If stack is empty, all parentheses are matched correctly
        return stack.isEmpty() ? 1: 0;
    }
    public static void main(String[] args) {
     String A = "{([])}";
     System.out.println(solve(A));
    }
}
