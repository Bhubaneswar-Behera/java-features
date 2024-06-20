package com.scaler.advanced.dsa.module5.twopointers;

/**
 * Given N non-negative integers A[0], A[1], ..., A[N-1] ,
 * where each represents a point at coordinate (i, A[i]).
 * N vertical lines are drawn such that the two endpoints of line i is at (i, A[i]) and (i, 0).
 * Find two lines, which together with x-axis forms a container,
 * such that the container contains the most water. You need to return this maximum area.
 * Note: You may not slant the container. It is guaranteed that the answer will fit in integer limits.
 *
 * Input : A = [1, 5, 4, 3]  Output : 6
 * Explanation : 5 and 3 are distance 2 apart.
 * So size of the base = 2. Height of container = min(5, 3) = 3.
 * So total area = 3 * 2 = 6
 *
 * Input : A = [1]           Output : 0
 * Explanation : No container is formed.
 *
 *
 *
 */
public class ContainerWithMostWater {
    public static int maxArea(int[] A) {
        int n = A.length;
        int i = 0;
        int j = n - 1;
        int answer = 0 ;

        while (i < j) {
            answer = Math.max(answer,Math.min(A[i],A[j]) * (j - i));
            if (A[i] < A[j]) {
                i++;
            } else if (A[i] > A[j]) {
                j--;
            } else {
                i++;
                j--;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] A = {1, 5, 4, 3};
        System.out.println(maxArea(A));
    }
}
