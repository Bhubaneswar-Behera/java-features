package com.scaler.advanced.dsa.advanceddsa2.module6.trees1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given a binary tree, return the inorder traversal of its nodes' values.
 *
 * Input 1:
 *
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 *  Output : [1, 3, 2]
 * Explanation : The Inorder Traversal of the given tree is [1, 3, 2].
 *
 * Input 2:
 *    1
 *   / \
 *  6   2
 *     /
 *    3
 * Output :  [6, 1, 3, 2]
 * Explanation : The Inorder Traversal of the given tree is [6, 1, 3, 2].
 */
public class InorderTraversal {
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode current = A;

        while (current != null || !stack.isEmpty()) {
            // Reach the leftmost node of the current node
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            // Current must be null at this point
            current = stack.pop();
            result.add(current.val); // Visit the node

            // Go to the right subtree
            current = current.right;
        }

        return result;
    }
    public static void main(String[] args) {

        // Example Usage:
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        InorderTraversal tree = new InorderTraversal();
        List<Integer> inorder = tree.inorderTraversal(root);
        System.out.println("Inorder Traversal: " + inorder); // Output: [1, 3, 2]
    }
}
