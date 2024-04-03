package com.scaler.intermediate.dsa.carryforwadandsubarrays;

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

    public int solve(String A) {
        int n = A.length();
        int answer = 0;
        int countOfA = 0;
        double b = 10;
        double e = 9;
        int mod = (int)Math.pow(10,9)+7 ;
        for(int i = 0 ;i < n;i++){
            if(A.charAt(i) == 'A'){
                countOfA++;
            } else if (A.charAt(i) == 'G') {
                answer = answer + countOfA;
                answer = answer % mod;
            }
        }
        return answer;
    }
    public static int count_ag(String A){
        int n = A.length();
        int result  = 0;
        int countOfA = 0;
        for (int i = 0;i < n;i++) {
            if(A.charAt(i) == 'A'){
                countOfA++;
            } else if (A.charAt(i) == 'G') {
                result = result + countOfA;
                result = result % 1000000007;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "abegag";
        System.out.println(count_ag_brute(s));
        System.out.println(count_ag(s));
    }
}
