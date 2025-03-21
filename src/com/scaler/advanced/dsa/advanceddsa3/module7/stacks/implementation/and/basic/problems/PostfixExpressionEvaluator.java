package com.scaler.advanced.dsa.advanceddsa3.module7.stacks.implementation.and.basic.problems;

import java.util.Stack;

/**
 * Given a postfix expression, the task is to evaluate the expression and print the final value. Operators will only include the basic arithmetic operators like *, /, + and -.
 * The input expression will be in form of a string.
 *
 * Example:
 * input : 2 3 +
 * Output : 5
 *
 * Input: "231*+9-"
 * Output: -4
 * Ex
 */
public class PostfixExpressionEvaluator {
    public static int solve(String A) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                int b = stack.pop();
                int a = stack.pop();
                switch (ch) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                }
            } else {
                stack.push(ch - '0');
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String str = "23+";
        System.out.println(solve(str));
    }
}
