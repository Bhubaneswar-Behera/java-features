package com.scaler.advanced.dsa.advanceddsa1.module5.maths.two.combinatorics.basics;

/**
 * Given a positive integer A, return its corresponding column title as it appears in an Excel sheet.
 *
 * For example:
 *     1 -> A
 *     2 -> B
 *     3 -> C
 *     ...
 *     26 -> Z
 *     27 -> AA
 *     28 -> AB
 *
 * Input :A = 3   Output : "C"
 * Explanation : 3 corrseponds to C.
 *
 * Input : A = 27 Output : "AA"
 * Explanation :
 *          1 -> A,
 *          2 -> B,
 *          3 -> C,
 *          ...
 *          26 -> Z,
 *          27 -> AA,
 *          28 -> AB
 *
 *
 */
public class ExcelColumnTitle {
    public static String convertToTitle(int A) {
        String answer = "";
        while (A > 0) {
            A = A - 1;
            answer = (char) (A % 26 + 'A') + answer;
            A =  A / 26;
        }

        return answer;
    }
    public static void main(String[] args) {
        int A = 3;
        System.out.println(convertToTitle(A));
    }
}
