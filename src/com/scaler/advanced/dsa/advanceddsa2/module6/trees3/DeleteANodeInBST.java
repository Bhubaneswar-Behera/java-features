package com.scaler.advanced.dsa.advanceddsa2.module6.trees3;

/**
 * Given a Binary Search Tree(BST) A. If there is a node with value B present in the tree delete it and return the tree.
 *
 * Note - If there are multiple options, always replace a node by its in-order predecessor
 * Example :
 *
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
 *      B = 10
 *Output :
 *
 *               15
 *             /    \
 *           12      20
 *           / \    /  \
 *          8  14  16  27
 *
 *  Explanation : Node with value 10 is deleted
 *
 * Input :
 *
 *             8
 *            / \
 *           6  21
 *          / \
 *         1   7
 *
 *      B = 6
 *
 * Output :
 *
 *             8
 *            / \
 *           1  21
 *            \
 *             7
 * Explanation : Node with value 6 is deleted
 *
 */
public class DeleteANodeInBST {
    public TreeNode solve(TreeNode A, int B) {
        if (A == null) {
            return A;
        }

        // Step 1: Find the node to be deleted
        if (B < A.val) {
            A.left = solve(A.left, B);
        } else if (B > A.val) {
            A.right = solve(A.right, B);
        } else {
            // Node to be deleted found

            // Case 1: Node with only one child or no child
            if (A.left == null) {
                return A.right;
            } else if (A.right == null) {
                return A.left;
            }

            // Case 2: Node with two children, get the in-order predecessor (max in left subtree)
            A.val = findMaxValue(A.left);

            // Delete the in-order predecessor from the left subtree
            A.left = solve(A.left, A.val);
        }

        return A;
    }
    private int findMaxValue(TreeNode node) {
        int maxValue = node.val;
        while (node.right != null) {
            node = node.right;
            maxValue = node.val;
        }
        return maxValue;
    }

    // In-order traversal for testing
    public void inOrderTraversal(TreeNode root) {
        if (root == null) return;
        inOrderTraversal(root.left);
        System.out.print(root.val + " ");
        inOrderTraversal(root.right);
    }
    public static void main(String[] args) {

    }
}
