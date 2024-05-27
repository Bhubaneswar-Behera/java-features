package com.scaler.intermediate.dsa.module2.arrays.sliding.window.contribution;

/**
 * Given an array A of size N, find the subarray of size B with the least average.
 *
 * Input : A = [3, 7, 90, 20, 10, 50, 40] B = 3 Output : 3
 * Explanation :
 * Subarray between indexes 3 and 5
 * The subarray {20, 10, 50} has the least average among all subarrays of size 3.
 *
 *
 * Input : A = [3, 7, 5, 20, -10, 0, 12] B = 2 Output : 4
 * Explanation : Subarray between [4, 5] has minimum average
 */
public class SubarrayWithLeastAverage {
    public static int solve(int[] A, int B) {
        int n = A.length;
        double average = 0;
        double sum=0;

        // find avg of 1st window
        for(int i=0; i<B; i++){
            sum+=A[i];
        }
        average = sum / B;

        // finding avg of rest of the windows
        int index = 0;
        for (int i = 1; i <= n - B; i++) {
            int j = i + B - 1;
            sum = sum + A[j] - A[i - 1];
            double currentAverage = sum / B;
            if(currentAverage < average){
                average = currentAverage;
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] A = {3, 7, 90, 20, 10, 50, 40};
        int B = 3;
        System.out.println(solve(A,B));
    }
}
