package com.scaler.advanced.dsa.advanceddsa1.module5.recursion.one;

/**
 * Write a program to find the factorial of the given number A using recursion.
 * Note: The factorial of a number N is defined as the
 * product of the numbers from 1 to N.
 *
 */
public class FindFactorial {

    public static int factorial(int A) {
        if(A == 0){
            return 1;
        }
        return factorial(A - 1) * A;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
}
