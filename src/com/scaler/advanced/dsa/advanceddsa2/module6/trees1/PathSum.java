package com.scaler.advanced.dsa.advanceddsa2.module6.trees1;

/**
 * Given a binary tree and a B, determine if the tree has a A-to-leaf path such that adding up all the values along the path equals the given B.
 * Problem Constraints
 * 1 <= number of nodes <= 105
 * -100000 <= B, value of nodes <= 100000
 *
 * Input 1:
 * Tree:    5
 *          / \
 *         4   8
 *        /   / \
 *       11  13  4
 *      /  \      \
 *     7    2      1
 *
 *  B = 22
 *  Output : 1
 *
 * Input 2:
 *  Tree:    5
 *          / \
 *         4   8
 *        /   / \
 *      -11 -13  4
 *
 *  B = -1
 *  Output : 0
 */
public class PathSum{
    public static int hasPathSum(TreeNode A, int B) {
        // Base case: if the node is null, return 0
        if (A == null) {
            return 0;
        }

        // Check if the current node is a leaf and its value equals the remaining B
        if (A.left == null && A.right == null) {
            return (A.val == B) ? 1 : 0;
        }

        // Recursively check the left and right subtrees with the updated B
        int remainingB = B - A.val;
        int leftResult = hasPathSum(A.left, remainingB);
        int rightResult = hasPathSum(A.right, remainingB);

        // Return 1 if either leftResult or rightResult is 1; otherwise, return 0
        return (leftResult == 1 || rightResult == 1) ? 1 : 0;
    }
    public static void main(String[] args) {
        // Example Usage:
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        PathSum tree = new PathSum();
        int sum = 22;
        int result = tree.hasPathSum(root, sum);
        System.out.println("Has path sum of " + sum + ": " + result); // Output: 1
    }
}
