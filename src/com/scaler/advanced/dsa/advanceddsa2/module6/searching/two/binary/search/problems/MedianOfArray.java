package com.scaler.advanced.dsa.advanceddsa2.module6.searching.two.binary.search.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * There are two sorted arrays A and B of sizes N and M respectively.
 * Find the median of the two sorted arrays ( The median of the array formed by merging both the arrays ).
 *
 * NOTE:
 * The overall run time complexity should be O(log(m+n)).
 * IF the number of elements in the merged array is even, then the median is the average of (n/2)th and (n/2+1)th element. For example, if the array is [1 2 3 4], the median is (2 + 3) / 2.0 = 2.5.
 *
 * Input : A = [1, 4, 5] B = [2, 3]   Output : 3.0
 * Explanation : The median of both the sorted arrays will be 3.0.
 *
 * Input : A = [1, 2, 3] B = [4]      Output : 2.5
 * Explanation : The median of both the sorted arrays will be (2+3)/2 = 2.5.
 */
public class MedianOfArray {

    // DO NOT MODIFY BOTH THE LISTS
    public static double findMedianSortedArrays(final List<Integer> A, final List<Integer> B) {
        double answer  = 0.0;
        int m = A.size();
        int n = B.size();

        if (m > n) {
            return findMedianSortedArrays(B, A);
        }

        int equalMiddle = (m + n + 1) / 2;
        int l = 0;
        int h = m;

        while (l <= h) {
            int mid1 = l + (h - l) / 2;
            int mid2 = equalMiddle - mid1;

            int Aleft = (mid1 == 0) ? Integer.MIN_VALUE : A.get(mid1 - 1);
            int Aright = (mid1 == m) ? Integer.MAX_VALUE : A.get(mid1);
            int Bleft = (mid2 == 0) ? Integer.MIN_VALUE : B.get(mid2 - 1);
            int Bright = (mid2 == n) ? Integer.MAX_VALUE : B.get(mid2);
            if (Aleft <= Bright && Bleft <= Aright) {
                int total = m + n;
                int maxLeft = Math.max(Aleft, Bleft);
                int minRight = Math.min(Aright, Bright);
                // For Even
                if (total % 2 == 0)
                    return (double)(0.5 * (maxLeft + minRight));
                return maxLeft;
            } else if (Aleft > Bright) {
                h = mid1 - 1;
            } else {
                l = mid1 + 1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(4);
        A.add(5);

        List<Integer> B = new ArrayList<>();
        B.add(2);
        B.add(3);
        System.out.println(findMedianSortedArrays(A,B));
    }
}
