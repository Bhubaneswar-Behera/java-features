package com.scaler.advanced.dsa.advanceddsa1.module5.recursion.one;

/**
 * You are given an integer A, print A to 1 using recursion.
 * Note :- After printing all the numbers from A to 1, print a new line.
 *
 * Input : 10
 * Output: 10 9 8 7 6 5 4 3 2 1
 * Explanation : Print 10 to 1 space separated integers.
 *
 * Input : 5
 * Output : 5 4 3 2 1
 * Explanation : Print 5 to 1 space separated integers.
 */
public class PrintAto1Function {
    public static void solve(int A) {
        if (A < 1) {
            System.out.println();
            return;
        }
        System.out.print(A +" ");
        solve(A - 1);
    }
    public static void main(String[] args) {
        int A = 9;
        solve(A);
    }
}
