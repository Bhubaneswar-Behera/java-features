package com.scaler.advanced.dsa.module4.recursion.two;

import java.util.Arrays;

/**
 *
 * Given N .Print all valid parentheses of length 2N.
 */
public class PrintAllValidParentheses {


    public static void printAllValidParenthesis(int n, int opening, int closing ,char[] str) {
        int index = opening + closing;

        if(index == 2*n){ // if(closing == n)
            System.out.println(str);
        }

        if (opening > closing) {
            str[index] = ')';
            printAllValidParenthesis(n, opening, closing + 1,str);
        }
        if (opening < n) {
            str[index] = '(';
            printAllValidParenthesis(n, opening + 1, closing ,str);
        }

    }
    public static void main(String[] args) {
        int n = 3;
        printAllValidParenthesis(n,0,0,new char[2*n]);
    }
}
