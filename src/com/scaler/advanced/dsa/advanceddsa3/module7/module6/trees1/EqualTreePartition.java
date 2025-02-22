package com.scaler.advanced.dsa.advanceddsa2.module6.trees1;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a binary tree A. Check whether it is possible to partition the tree to two trees which have equal sum of
 * values after removing exactly one edge on the original tree.
 *
 * Example:
 *
 * Input :
 *
 *
 *                 5
 *                /  \
 *               3    7
 *              / \  / \
 *             4  6  5  6
 * Output : 1
 * Explanation :
 *
 *  Remove edge between 5(root node) and 7:
 *         Tree 1 =                                    Tree 2 =
 *                         5                                7
 *                        /                                / \
 *                       3                                5   6
 *                      / \
 *                     4   6
 *         Sum of Tree 1 = Sum of Tree 2 = 18
 *
 * Input :
 *
 *
 *                 1
 *                / \
 *               2   10
 *                   / \
 *                  20  2
 * Output : 0
 */
public class EqualTreePartition {
    Set<Long> hashSet = new HashSet<>();

    public  long sum(TreeNode root) {
        if(root == null) return 0;
        TreeNode curr = root;
        long lsum = sum(curr.left);
        long rsum = sum(curr.right);
        long val = curr.val;
        long sum = val + lsum + rsum;
        hashSet.add(sum);
        return sum;
    }
    public int solve(TreeNode A) {
        if(A == null){
            return 0;
        }
        long halfSum = sum(A)/2;
        if (hashSet.contains(halfSum)){
            return 1;
        }
       return 0;

    }
    public static void main(String[] args) {

    }
}
