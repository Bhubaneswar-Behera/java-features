package com.scaler.intermediate.dsa.module3.strings;

/**
 * You are given a string A of size N.
 *
 * Return the string A after reversing the string word by word.
 *
 * NOTE:
 *
 * A sequence of non-space characters constitutes a word.
 * Your reversed string should not contain leading or trailing spaces,
 * even if it is present in the input string.
 * If there are multiple spaces between words,
 * reduce them to a single space in the reversed string.
 *
 * Input : A = "the sky is blue"
 * Output :"blue is sky the"
 *
 * Explanation :
 * We reverse the string word by word so the string becomes "blue is sky the".
 */

public class ReverseTheStringWordByWord {

    public static String solve(String A) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] stringArray = A.split(" ");
        int length = stringArray.length;

        for(int i = length - 1;i>=0 ;i--){
            stringBuilder.append(stringArray[i]);
            if (i > 0) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString().trim();
    }
    public static void main(String[] args) {
        String A = "the sky is blue";
        System.out.println(solve(A));
    }
}
