package com.scaler.intermediate.dsa.interview.problems;

import java.util.Arrays;

/**
 * You are given two lowercase strings A and B each of length N.
 * Return 1 if they are anagrams to each other and 0 if not.
 *
 * Note : Two strings A and B are called anagrams to each other if A can be formed after rearranging the letters of B.
 *
 * Input : A = "cat" B = "bat"        Output : 0
 * Input : A = "secure" B = "rescue"  Output : 1
 */
public class CheckAnagrams {

    public static int solve(String A, String B) {
        if(A.length() != B.length()){
            return 0;
        }
        char[] firstArray = A.toCharArray();
        char[] secondChar = B.toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondChar);

        for(int i = 0 ; i < A.length();i++){
            if (firstArray[i] != secondChar[i]){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        String A = "cat";
        String B = "tac";

        System.out.println(solve(A,B));

    }
}
