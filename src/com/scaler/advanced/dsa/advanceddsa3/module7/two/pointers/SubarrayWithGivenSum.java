package com.scaler.advanced.dsa.advanceddsa3.module7.two.pointers;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given an array of positive integers A and an integer B,
 * find and return first continuous subarray which adds to B.
 * If the answer does not exist return an array with a single integer "-1".
 * First sub-array means the sub-array for which starting index in minimum.
 *
 * Input : A = [1, 2, 3, 4, 5] B = 5           Output : [2, 3]
 * Explanation : [2, 3] sums up to 5.
 *
 * Input : A = [5, 10, 20, 100, 105] B = 110   Output : [-1]
 * Explanation : No subarray sums up to required number.
 *
 *
 */
public class SubarrayWithGivenSum {
    public static int[] solve(int[] A, int B) {
        int n = A.length;
        int i = 0;
        int j = 0;
        int sum = A[0];
        boolean found = false;
        ArrayList<Integer> answer = new ArrayList<>();

        while (j < A.length) {
            //sum = sum + A[j];

            if (sum == B) {
                found = true;
                break;
            } else if (sum < B){
                j++;
                if(j == n){
                    break;
                }
                sum = sum + A[j];
            } else {
                sum  = sum - A[i];
                i++;
            }
        }

        if (found) {
            for (int k = i; k <= j; k++) {
                answer.add(A[k]);
            }
        } else {
            answer.add(-1);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int B = 5;
        System.out.println(Arrays.toString(solve(A,B)));
    }
}
