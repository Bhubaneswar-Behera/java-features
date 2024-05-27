package com.scaler.intermediate.dsa.module2.arrays.carry.forward.and.subarrays;

/**
 * Give a String of lowercase characters, return the count of pairs (i,e)
 * such that i < j and s[i] = 'a' and s[j] = 'g'.
 *
 * You have given a string A having Uppercase English letters.
 * You have to find how many times subsequence "AG" is there in the given string.
 *
 * NOTE: Return the answer modulo 109 + 7 as the answer can be very large.
 *
 */
public class SpecialSubsequencesAG {

    public static int count_ag_brute(String s){
        int n = s.length();
        int count = 0;
        for (int i = 0;i< n;i++) {
            if(s.charAt(i) == 'A'){
                for (int j = i + 1;j < n;j++) {
                    if(s.charAt(j) == 'G'){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static int solve(String A) {
        int n = A.length();
        int answer = 0;
        int countOfA = 0;

        for(int i = 0 ;i < n;i++){
            if(A.charAt(i) == 'A'){
                countOfA++;
            } else if (A.charAt(i) == 'G') {
                answer = answer + countOfA;
                answer = answer % 1000000007;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "ABCGAG";
        System.out.println(count_ag_brute(s));
        System.out.println(solve(s));
    }
}
