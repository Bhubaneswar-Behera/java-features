package com.scaler.advanced.dsa.advanceddsa1.module5.recursion.one;

/**
 * Write a recursive function that checks whether string A is a palindrome or Not.
 * Return 1 if the string A is a palindrome, else return 0.
 * Note: A palindrome is a string that's the same when read forward and backward.
 *
 * Input : A = "naman"   Output : 1
 * Explanation : "naman" is a palindomic string, so return 1.
 *
 * Input : A = "strings" Output : 0
 * Explanation : "strings" is not a palindrome, so return 0.
 *
 */
public class CheckPalindromeUsingRecursion {
    public static int solve(String A) {
        if (A.length() == 0 || A.length() ==1){
            return 1;
        }
        int n = A.length();
        if (A.charAt(0) != A.charAt(n-1)) {
            return 0;
        }

        return solve(A.substring(1,n-1));
    }
    public static void main(String[] args) {
        String A = "naman";
        System.out.println(solve(A));
    }
}
