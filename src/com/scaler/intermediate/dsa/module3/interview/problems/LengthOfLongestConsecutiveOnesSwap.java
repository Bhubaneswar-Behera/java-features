package com.scaler.intermediate.dsa.module3.interview.problems;

/**
 * Given a binary string A. It is allowed to do at most one swap between any 0 and 1.
 * Find and return the length of the longest consecutive 1’s that can be achieved.
 *
 *
 * Input Format :The only argument given is string A.
 * Output Format :Return the length of the longest consecutive 1’s that can be achieved.
 * Constraints : 1 <= length of string <= 1000000 , A contains only characters 0 and 1.
 *
 *Example
 *Input : A = "111000"
 *Output : 3
 *
 * Input : A = {1,0,1,1,0,1}
 * Output : 4
 * Explanation : {1,1,1,1,0,0} --> Swap 1st index 0 with 5th index 1
 */
public class LengthOfLongestConsecutiveOnesSwap {

    public static int solve(String A) {
        int n = A.length();
        int maxCount = 0;
        int totalOnes = 0;

        for(int i = 0 ;i < n ; i++ ){ // if all elements are 1
            if(A.charAt(i) == '1'){
                totalOnes++;
            }
        }
        if(totalOnes == n){
            return  n;
        }
        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == '0') {
                int j = i - 1; //go left
                int l = 0;
                while (j >= 0 && A.charAt(j) == '1') {
                    j--;
                    l++;
                }

                j = i + 1;//go right
                int r = 0;
                while (j < n && A.charAt(j) == '1') {
                    j++;
                    r++;
                }
                if(l + r == totalOnes){
                    maxCount = Math.max(maxCount,l+r);
                }
                else{
                    maxCount = Math.max(maxCount,l+r+1);
                }
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        String str = "11010110000000000";
        System.out.println(solve(str));

    }
}
