package com.scaler.advanced.dsa.advanceddsa2.module6.trees3;

/**
 * Given a Binary Search Tree A.
 * Check whether there exists a node with value B in the BST.
 *
 * Example :
 * Input :
 *
 *             15
 *           /    \
 *         12      20
 *         / \    /  \
 *        10  14  16  27
 *       /
 *      8
 *
 *      B = 16
 * Output : 1
 * Explanation : Node with value 16 is present.
 *
 * Input :
 *
 *             8
 *            / \
 *           6  21
 *          / \
 *         1   7
 *
 *      B = 9
 * Output : 0
 * Explanation : There is no node with value 9.
 */
public class SearchInBST {
    public int solve(TreeNode A, int B) {
        if (A == null) {
            return 0; // Value B does not exist
        }
        if (A.val == B) {
            return 1; // Value B found
        } else if (B < A.val) {
            return solve(A.left, B); // Search in the left subtree
        } else {
            return solve(A.right, B); // Search in the right subtree
        }
    }
    public static void main(String[] args) {

    }
}
