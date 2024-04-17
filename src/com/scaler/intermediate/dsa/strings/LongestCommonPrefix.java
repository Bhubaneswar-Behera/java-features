package com.scaler.intermediate.dsa.strings;

import java.util.Arrays;

/**
 * Given the array of strings A, you need to find the longest string S,
 * which is the prefix of ALL the strings in the array.
 * The longest common prefix for a pair of strings S1 and S2
 * is the longest string S which is the prefix of both S1 and S2.
 *
 * Example: the longest common prefix of "abcdefgh" and "abcefgh" is "abc".
 *
 */
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] A) {
        StringBuilder stringBuilder = new StringBuilder();
        Arrays.sort(A);
        char[] first = A[0].toCharArray();
        char[] last = A[A.length - 1].toCharArray();
        for(int i = 0; i< first.length;i++){
            if(first[i] != last[i]) {
                break;
            }
            stringBuilder.append(first[i]);
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        String[] A = {"abcdefgh", "aefghijk", "abcefgh"};
        System.out.println(longestCommonPrefix(A));
    }
}
