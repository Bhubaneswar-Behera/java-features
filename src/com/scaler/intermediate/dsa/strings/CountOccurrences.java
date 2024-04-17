package com.scaler.intermediate.dsa.strings;

/**
 * Find the number of occurrences of bob in
 * string A consisting of lowercase English alphabets.
 * Input : "abobc"
 * Output : 1
 */
public class CountOccurrences {

    public static int solve(String A) {
        int n = A.length();
        int answer = 0;
        for(int i = 0;i< n - 2;i++){
            if(A.charAt(i) == 'b' && A.charAt(i+1) == 'o' && A.charAt(i+2) == 'b'){
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        String A = "abobc";
        System.out.println(solve(A));

    }
}
