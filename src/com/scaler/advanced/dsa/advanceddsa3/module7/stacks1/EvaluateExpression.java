package com.scaler.advanced.dsa.advanceddsa3.module7.stacks1;

import java.util.Stack;

/**
 *An arithmetic expression is given by a string array A of size N.
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 *
 * Valid operators are +, -, *, /. Each string may be an integer or an operator.
 *
 * Note: Reverse Polish Notation is equivalent to Postfix Expression,
 *      where operators are written after their operands.
 *
 * Input : A =   ["2", "1", "+", "3", "*"]  Output : 9
 * Explaination :
 * starting from backside:
 *     * : () * ()
 *     3 : () * (3)
 *     + : (() + ()) * (3)
 *     1 : (() + (1)) * (3)
 *     2 : ((2) + (1)) * (3)
 *     ((2) + (1)) * (3) = 9
 *
 * Input : A = ["4", "13", "5", "/", "+"] Output : 6
 * Explaination :
 *  * starting from backside:
 *  *     + : () + ()
 *  *     / : () + (() / ())
 *  *     5 : () + (() / (5))
 *  *     13 : () + ((13) / (5))
 *  *     4 : (4) + ((13) / (5))
 *  *     (4) + ((13) / (5)) = 6
 *
 */
public class EvaluateExpression {
    public static int evalRPN(String[] A) {
        Stack<Integer> stack = new Stack<>();

        for (String token : A) {
            // If the token is an operator
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int b = stack.pop(); // Second operand
                int a = stack.pop(); // First operand

                // Perform the operation and push the result back to the stack
                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b); // Integer division
                        break;
                }
            } else {
                // If the token is a number, push it to the stack
                stack.push(Integer.parseInt(token));
            }
        }

        // The final result is the last element in the stack
        return stack.pop();

    }
    public static void main(String[] args) {
     String[] A =   {"2", "1", "+", "3", "*"};
        System.out.println(evalRPN(A));
    }
}
