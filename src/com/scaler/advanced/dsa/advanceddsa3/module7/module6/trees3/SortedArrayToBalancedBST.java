package com.scaler.advanced.dsa.advanceddsa2.module6.trees3;

/**
 * Given an array where elements are sorted in ascending order, convert it to a height Balanced Binary Search Tree (BBST).
 * Balanced tree : a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 *
 * Example :
 * Input : A : [1, 2, 3]
 * Output :
 *       2
 *     /   \
 *    1     3
 * Explanation : You need to return the root node of the Binary Tree.
 * Output :
 *       3
 *     /   \
 *    2     5
 *   /       \
 *  1         10
 *
 * Input : A : [1, 2, 3, 5, 10]
 */
public class SortedArrayToBalancedBST {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public TreeNode sortedArrayToBST(final int[] A) {
        return sortedArrayToBSTHelper(A, 0, A.length - 1);
    }
    private TreeNode sortedArrayToBSTHelper(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        // Find the middle element
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        // Recursively build the left and right subtrees
        root.left = sortedArrayToBSTHelper(nums, start, mid - 1);
        root.right = sortedArrayToBSTHelper(nums, mid + 1, end);

        return root;
    }
    public static void main(String[] args) {

    }
}
