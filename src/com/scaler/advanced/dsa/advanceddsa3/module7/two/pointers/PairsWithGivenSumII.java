package com.scaler.advanced.dsa.advanceddsa3.module7.two.pointers;

/**
 * Given a sorted array of integers (not necessarily distinct) A and an integer B,
 * find and return how many pair of integers ( A[i], A[j] ) such that i != j have sum equal to B.
 * Since the number of such pairs can be very large, return number of such pairs modulo (109 + 7).
 *
 * Input : A = [1, 1, 1]      B = 2   Output : 3
 * Input : A = [1, 5, 7, 10]  B = 8   Output : 1
 *
 *
 */
public class PairsWithGivenSumII {

    public static int solveWithOutDuplicates(int[] A, int B) {
        int n = A.length;
        int answer = 0;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (A[i] + A[j] == B) {
                i++;
                j--;
               answer++;
            } else if (A[i] + A[j] < B) {
                i++;
            } else {
                j--;
            }
        }
        return answer;
    }
    public static int solveWithDuplicates(int[] A, int B) {
        int n = A.length;
        long count = 0; // Use long to avoid overflow during calculations
        // Initialize two pointers
        int i = 0;
        int j = n - 1;
        while (i < j) {
            int sum = A[i] + A[j];
            if (sum == B) {
                // If the sum is equal to B, count all pairs formed by left and right pointers
                // This is given by (right - left) since the array is sorted
                if (A[i] == A[j]) {
                    // If both pointers point to the same element, calculate pairs using combinations
                    count = count +  (long) (j - i + 1) * (j - i) / 2;
                    count = count % 1000000007;
                    break;
                } else {
                    // Otherwise, multiply occurrences to get total pairs
                    int leftCount = 1; // Count occurrences of A[left]
                    while (i < j && A[i] == A[i + 1]) {
                        i++;
                        leftCount++;
                    }
                    int rightCount = 1; // Count occurrences of A[right]
                    while (i < j && A[j] == A[j - 1]) {
                        j--;
                        rightCount++;
                    }
                    count += (long) leftCount * rightCount;
                    count = count % 1000000007; // Take modulo to avoid overflow
                    i++; // Move left pointer forward
                    j--; // Move right pointer backward
                }
            } else if (sum < B) {
                // If sum is less than B, move left pointer forward
                i++;
            } else {
                // If sum is greater than B, move right pointer backward
                j--;
            }
        }
        return (int) count; // Cast count back to int before returning
    }
    public static void main(String[] args) {
        int[] A = {1, 5, 7, 10};
        int B = 8;
        System.out.println(solveWithOutDuplicates(A,B));


        int[] A1 = {1, 1, 1};
        int B1 = 2;
        System.out.println(solveWithDuplicates(A1,B1));
    }
}
