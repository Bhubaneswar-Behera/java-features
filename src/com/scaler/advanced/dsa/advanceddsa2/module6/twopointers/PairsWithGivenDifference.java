package com.scaler.advanced.dsa.advanceddsa2.module6.twopointers;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an one-dimensional integer array A of size N and an integer B.
 * Count all distinct pairs with difference equal to B.
 * Here a pair is defined as an integer pair (x, y),
 * where x and y are both numbers in the array and their absolute difference is B.
 *
 * Input : A = [1, 5, 3, 4, 2]       B = 3   Output : 2
 * Explanation : There are 2 unique pairs with difference 3, the pairs are {1, 4} and {5, 2}
 *
 *
 * Input : A = [8, 12, 16, 4, 0, 20] B = 4   Output : 5
 * Explanation : There are 5 unique pairs with difference 4,
 *               the pairs are {0, 4}, {4, 8}, {8, 12}, {12, 16} and {16, 20}
 *
 * Input : A = [1, 1, 1, 2, 2]       B = 0   Output : 2
 * Explanation : There are 2 unique pairs with difference 0, the pairs are {1, 1} and {2, 2}.
 *
 *
 */
public class PairsWithGivenDifference {
    public static int solve(int[] A, int B) {
        Set<Integer> set = new HashSet<>();
        Set<String> pairs = new HashSet<>();

        for (int num : A) {
            if (set.contains(num + B)) {
                pairs.add((num + B) + "," + num);
            }
            if (set.contains(num - B)) {
                pairs.add(num + "," + (num - B));
            }
            set.add(num);
        }

        return pairs.size();
    }
    public static void main(String[] args) {
            int[] A = {1,1,1,1,1,1,1,1,1,1};
            int B = 0;
            System.out.println(solve(A,B));
    }
}
