package com.scaler.intermediate.dsa.module3.interview.problems;

/**
 *
 *  Given a binary string A. we can replace only 0 with 1. Find the maximum number of consecutive
 *  1's that can be obtained after the replacement.
 *
 * Input Format :The only argument given is string A.
 * Output Format :Return the length of the longest consecutive 1’s that can be achieved.
 * Constraints : 1 <= length of string <= 1000000 , A contains only characters 0 and 1.
 *
 * Input : A = {1,1,0,1,1,0,1,1}
 * Output : 5
 */
public class LengthOfLongestConsecutiveOnesReplacement {

    public static int solve(int[] nums) {
        int n = nums.length;;
        int maxCount = 0;
        int totalOnes = 0;

        for(int i = 0 ;i < n ; i++ ){ // if all elements are 1
            if(nums[i] == 1){
                totalOnes++;
            }
        }
        if(totalOnes == n){
                return  n;
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                int j = i - 1; //go left
                int l = 0;
                while (j >= 0 && nums[j] == 1) {
                    j--;
                    l++;
                }

                j = i + 1;//go right
                int r = 0;
                while (j < n && nums[j] == 1) {
                    j++;
                    r++;
                }
                maxCount = Math.max(maxCount, l + r + 1);
            }
        }

        return maxCount;
    }
    public static void main(String[] args) {
        int[] A = {1,1,0,1,1,0,1,1};
        System.out.println(solve(A));
    }
}
