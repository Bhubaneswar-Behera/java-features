package com.scaler.advanced.dsa.advanceddsa3.module7.stacks.implementation.and.basic.problems;

import java.util.Stack;

/**
 * Given a string s, remove all the consecutive elements from the string.
 * Input : abcddc
 * Output : ab
 */
public class RemoveConsceutiveElements {
    public static String solve(String str) {
        Stack stack = new Stack();
        for (int i = 0; i < str.length(); i++) {
            if (stack.isEmpty() || (char) stack.peek() != str.charAt(i)) {
                stack.push(str.charAt(i));
            } else {
                stack.pop();
            }
        }
        String result = "";
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return new StringBuilder(result).reverse().toString();
    }
    //
    public static void main(String[] args) {
    String str = "abcddc";
        System.out.println(solve(str));
    }

}
