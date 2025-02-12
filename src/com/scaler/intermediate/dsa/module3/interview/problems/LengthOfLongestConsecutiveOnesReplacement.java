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
                int numberOfElementsToTheLeft = 0;//how many element to the left I am taking
                while (j >= 0 && nums[j] == 1) {
                    j--;
                    numberOfElementsToTheLeft++;
                }

                j = i + 1;//go right
                int numberOfElementsToTheRight = 0;//how many element to the right I am taking
                while (j < n && nums[j] == 1) {
                    j++;
                    numberOfElementsToTheRight++;
                }
                maxCount = Math.max(maxCount, numberOfElementsToTheLeft + numberOfElementsToTheRight + 1);//+1 as we have to change 0 to 1 also
            }
        }

        return maxCount;
    }
    public static void main(String[] args) {
        int[] A = {1,1,0,1,1,0,1,1};
        System.out.println(solve(A));
    }
}
