package com.scaler.intermediate.dsa.module3.strings;

/**
 * Given a string A,
 * you are asked to reverse the string and return the reversed string.
 *
 * Input: A = "scaler"
 * Output: relacs"
 */
public class SimpleReverse {

    public static String solve(String A) {
        int n = A.length();
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = n -1 ;i >= 0;i--){
            stringBuilder.append(A.charAt(i));
        }

        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        String A = "scaler";
        System.out.println(solve(A));
    }
}
