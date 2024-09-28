package com.scaler.advanced.dsa.advanceddsa3.module7.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer A pairs of parentheses,
 * write a function to generate all combinations of well-formed parentheses of length 2*A.
 *
 * Input : A = 3
 * Output : [ "((()))", "(()())", "(())()", "()(())", "()()()" ]
 * Explanation : All paranthesis are given in the output list.
 *
 * Input : A = 1
 * Output : [ "()" ]
 * Explanation : All paranthesis are given in the output list.
 *
 *
 */
public class GenerateAllParentheses {
    static ArrayList<String> arrayList;

    public static String[] generateParentheses(int A) {
        List<String> result = new ArrayList<>();
        generateCombinations(result, "", 0, 0, A);
        // Convert the List to a String array and return
        return result.toArray(new String[0]);
    }

    private static void generateCombinations(List<String> result, String current, int openCount, int closeCount, int max) {
        // Base case: if the current string has reached the maximum length
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        // Add an opening parenthesis if the count of open parentheses is less than the maximum
        if (openCount < max) {
            generateCombinations(result, current + "(", openCount + 1, closeCount, max);
        }

        // Add a closing parenthesis if the count of closing parentheses is less than open parentheses
        if (closeCount < openCount) {
            generateCombinations(result, current + ")", openCount, closeCount + 1, max);
        }
    }

    public static void main(String[] args) {
        int A = 3;
        String[] result = generateParentheses(A);
        for (String s : result) {
            System.out.println(s);
        }
    }
}
