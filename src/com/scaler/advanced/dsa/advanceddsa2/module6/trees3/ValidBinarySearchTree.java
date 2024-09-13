package com.scaler.advanced.dsa.advanceddsa2.module6.trees3;

/**
 * You are given a binary tree represented by root A. You need to check if it is a Binary Search Tree or not.
 * Assume a BST is defined as follows:
 *
 * 1) The left subtree of a node contains only nodes with keys less than the node's key.
 *
 * 2) The right subtree of a node contains only nodes with keys greater than the node's key.
 *
 * 3) Both the left and right subtrees must also be binary search trees.
 *
 * Example :
 * Input :
 *    1
 *   /  \
 *  2    3
 * Output : 0
 * Explanation : 2 is not less than 1 but is in left subtree of 1.
 *
 * Input :
 *   2
 *  / \
 * 1   3
 * Output : 1
 * Explanation : Satisfies all conditions.
 */
public class ValidBinarySearchTree {
    public int isValidBST(TreeNode A) {
        return isBSTHelper(A, Long.MIN_VALUE, Long.MAX_VALUE) ? 1 : 0;
    }
    private boolean isBSTHelper(TreeNode node, long min, long max) {
        if (node == null) {
            return true;
        }

        // Check the current node's value is within the valid range
        if (node.val <= min || node.val >= max) {
            return false;
        }

        // Recursively check the left and right subtrees
        return isBSTHelper(node.left, min, node.val) && isBSTHelper(node.right, node.val, max);
    }
    public static void main(String[] args) {

    }
}
