package com.scaler.advanced.dsa.advanceddsa1.module5.maths.two.combinatorics.basics;

/**
 * Given a string A. Find the rank of the string amongst its permutations sorted lexicographically.
 * Assume that no characters are repeated.
 *
 * Note: The answer might not fit in an integer, so return your answer % 1000003
 *
 * Input : A = "acb" Output : 2
 * Explanation :
 * Given A = "acb".
 * The order permutations with letters 'a', 'c', and 'b' :
 * abc
 * acb
 * bac
 * bca
 * cab
 * cba
 * So, the rank of A is 2.
 *
 * Input : A = "a" Output : 1
 * Explanation : Given A = "a". Rank is clearly 1.
 *
 */
public class SortedPermutationRank {
    public static int findRank(String A) {
        int n = A.length();
        int answer = 0;


        for (int i = 0; i < n -1 ; i++) {
            int count = 0;
            for (int j = i + 1; j < n ; j++) {
                if (A.charAt(j) < A.charAt(i)) {
                    count++;
                }
            }
            answer = answer + (count * factorial(n - i -1)) % 1000003;
            answer = answer % 1000003;
        }
        return answer+1;
    }

    public static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return (factorial(n-1)*n)%1000003;
    }
    public static void main(String[] args) {
        String A = "acb";
        System.out.println(findRank(A));
    }
}
