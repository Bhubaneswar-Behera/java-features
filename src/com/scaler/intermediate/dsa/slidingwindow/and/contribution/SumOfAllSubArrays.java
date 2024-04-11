package com.scaler.intermediate.dsa.slidingwindow.and.contribution;

/**
 * Given arr[n], find the sum of total of all the possible subarrays.
 * (Sum of all subarray sums)
 *
 * Note : Be careful of integer overflow issues while calculations.
 * Use appropriate datatypes.
 * Example Input : A = [1, 2, 3]
 * Output : 20
 *
 * Explanation : The different subarrays for the given array are: [1], [2], [3], [1, 2], [2, 3], [1, 2, 3].
 * Their sums are: 1 + 2 + 3 + 3 + 5 + 6 = 20
 */
public class SumOfAllSubArrays {
    public static int calculateSumBruteForce(int[] A, int n){
        int totalSum = 0;
        for(int i = 0 ; i < n ;i++){
            for(int j = i ; j < n ; j++){
                int sum = 0;
                for(int k = i ; k <= j ;k++){
                    sum = sum + A[k];
                }
                totalSum = totalSum + sum;
            }
        }
        return totalSum;
    }

    public static int calculateSumCarryForward(int[] A, int n){
        int totalSum = 0;
        for (int i = 0 ; i < n;i++) {
            int sum = 0;
            for(int j = i ; j< n ;j++){
                sum = sum + A[j];
                totalSum = totalSum +sum;
            }
        }
        return totalSum;
    }

    public static int calculateSumContributionTechnique(int[] A, int n){
        int totalSum = 0;
        for (int i = 0;i< n;i++) {
            totalSum = totalSum + A[i]*(i+1) * (n-i);
        }
        return totalSum;
    }
    public long subarraySum(int[] A) {
        int n = A.length;
        long total = 0;

        for(int i = 0;i< n;i++){
            total = total + (long)A[i]*(i+1)*(n-i);
        }
        return total;
    }

    public static void main(String[] args) {
        int[] A = {1,2,3};
        int n = A.length;
        System.out.println(calculateSumBruteForce(A, n));
        System.out.println(calculateSumCarryForward(A, n));
        System.out.println(calculateSumContributionTechnique(A, n));

    }
}

