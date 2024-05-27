package com.scaler.intermediate.dsa.module3.strings;

/**
 * You are given a function isalpha() consisting of a character array A.
 *
 * Return 1 if all the characters of a character
 * array are alphanumeric (a-z, A-Z, and 0-9) else, return 0.
 *
 * Input :
 * A = ['S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0']
 *
 * Output : 1
 */
public class IsAlphaNumeric {

    public static int solve(char[] A) {
        int n = A.length;

        for(int i = 0 ; i< n; i++){
            if((A[i] < 'A' || A[i] > 'Z') && (A[i] < 'a' || A[i] > 'z') && (A[i] < '0' || A[i] > '9')){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        char[] A = {'S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0'};
        System.out.println(solve(A));
    }
}
