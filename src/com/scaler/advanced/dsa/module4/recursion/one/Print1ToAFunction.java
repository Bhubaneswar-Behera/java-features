package com.scaler.advanced.dsa.module4.recursion.one;

/**
 * You are given an integer A, print 1 to A using recursion.
 * Note :- After printing all the numbers from 1 to A, print a new line.
 *
 * Input : A = 10
 * Output : 1 2 3 4 5 6 7 8 9 10
 * Explanation : Print 1 to 10 space separated integers.
 */
public class Print1ToAFunction {
   /* public static void printIncreasing(int A) {
        if(A == 0){
            return;
        }
        printIncreasing(A - 1);
        System.out.println(A + " ");
    }*/
    public static void printIncreasing(int A){
        if(A == 1){
            System.out.println(A);
            return;
        }
        printIncreasing(A - 1);
        System.out.print(A + " ");
    }
    public static void solve(int A) {
        printIncreasing(A);
        System.out.print("\n");
    }

    public static void printDecreasing(int A) {
        if(A == 0){
            return;
        }
        System.out.print(A + " ");
        printDecreasing(A - 1);
    }
    public static void main(String[] args) {
        int A = 10;
        printIncreasing(A);
        System.out.println();
        printDecreasing(A);
    }
}
