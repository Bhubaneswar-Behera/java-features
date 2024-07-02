package com.scaler.advanced.dsa.advanceddsa1.module5.maths.two.combinatorics.basics;

/**
 * Given a column title as appears in an Excel sheet, return its corresponding column number.
 *
 * Input : AB Output : 28
 * Explanation :
 *      A -> 1
 *      B -> 2
 *      C -> 3
 *      ...
 *      Z -> 26
 *      AA -> 27
 *      AB -> 28
 *
 * Input : BB Output : 54
 * Explanation :
 *      A -> 1
 *      B -> 2
 *      C -> 3
 *      ...
 *      Z -> 26
 *      AA -> 27
 *      AB -> 28
 *      ...
 *      AZ -> 52
 *      BA -> 53
 *      BB -> 54
 *
 */
public class ExcelColumnNumber {
    public static int titleToNumber(String A) {
        int n = A.length();
        int answer = 0;
        int multiply = 1;

        for (int i = n - 1 ; i >= 0; i--) {
            answer = answer + multiply * (A.charAt(i) - 'A' + 1);
            multiply = multiply * 26;
        }

        return answer;
    }
    public static void main(String[] args) {
        String A = "AA";
        System.out.println(titleToNumber(A));

    }
}
