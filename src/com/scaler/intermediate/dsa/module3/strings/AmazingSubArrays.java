package com.scaler.intermediate.dsa.module3.strings;

/**
 * You are given a string S, and you have to find all the amazing substrings of S.
 *An amazing Substring is one that starts with a vowel
 * (a, e, i, o, u, A, E, I, O, U).
 *
 * Input :Only argument given is string S.
 * Output : Return a single integer X mod 10003,
 * here X is the number of Amazing Substrings in given the string.
 *
 * Constraints :1 <= length(S) <= 1e6 , S can have special characters
 *
 * Example
 *
 * Input
 *     ABEC
 *
 * Output
 *     6
 *
 * Explanation
 *     Amazing substrings of given string are :
 *     1. A
 *     2. AB
 *     3. ABE
 *     4. ABEC
 *     5. E
 *     6. EC
 *     here number of substrings are 6 and 6 % 10003 = 6.
 *
 */
public class AmazingSubArrays {
    public static int solve(String A) {
        int n = A.length();
        int answer = 0;

        for(int i = 0 ;i < n ;i++){
            char ch = A.charAt(i);

           if("AEIOUaeiou".indexOf(ch) != -1){
               answer = (answer + n -i)% 10003;
           }
        }
        return answer;
    }


    public static void main(String[] args) {
        String A = "ABEC";
        System.out.println(solve(A));
    }
}
