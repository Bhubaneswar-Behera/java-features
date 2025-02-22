package com.scaler.advanced.dsa.advanceddsa3.module7.stacks1;

import java.util.Stack;

/**
 * You have a string, denoted as A.
 *
 * To transform the string, you should perform the following operation repeatedly:
 * 1. Identify the first occurrence of consecutive identical pairs of characters within the string.
 * 2. Remove this pair of identical characters from the string.
 * 3. Repeat steps 1 and 2 until there are no more consecutive identical pairs of characters.
 *
 * The final result will be the transformed string.
 *
 * Input : A = "abccbc"  Output : "ac"
 * Explanation 1:
 * The Given string is "abccbc".
 *
 * Remove the first occurrence of consecutive identical pairs of characters "cc".
 * After removing the string will be "abbc".
 *
 * Again Removing the first occurrence of consecutive identical pairs of characters "bb".
 * After remvoing, the string will be "ac".
 *
 * Now, there is no consecutive identical pairs of characters.
 * Therefore the string after this operation will be "ac".
 *
 * Input : A = "ab"      Output : "ab"
 * Explanation : No removals are to be done.
 *
 *
 *
 *
 */
public class DoubleCharacterTrouble {

    public static String solve(String A) {
        int n = A.length();
        Stack<Character> stack = new Stack <> ();
        for (int i = 0; i < n; i++) {
            // if stack is not empty and if the top element is same as incoming ele pop the top
            if (!stack.isEmpty() && stack.peek() == A.charAt(i)) {
                stack.pop();
            } else { // else push the incoming ele to the top
                stack.push(A.charAt(i));
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()) {
            // ensures every popped up element gets stored in 0th index so that we get correct order
            ans.insert(0, stack.pop());
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String A = "abccbc";
        System.out.println(solve(A));
    }
}
