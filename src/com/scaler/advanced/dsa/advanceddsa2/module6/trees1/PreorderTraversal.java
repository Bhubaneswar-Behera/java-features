package com.scaler.advanced.dsa.advanceddsa2.module6.trees1;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal {
    public static ArrayList<Integer> preorderTraversal(TreeNode A) {
        ArrayList<Integer> result = new ArrayList<>();
        preorderHelper(A, result);
        return result;
    }
    private static void preorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        // Visit the root node
        result.add(node.val);

        // Traverse the left subtree
        preorderHelper(node.left, result);

        // Traverse the right subtree
        preorderHelper(node.right, result);
    }
    public static void main(String[] args) {
        // Example Usage:
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        PreorderTraversal tree = new PreorderTraversal();
        List<Integer> preorder = tree.preorderTraversal(root);
        System.out.println("Preorder Traversal: " + preorder); // Output: [1, 2, 4, 5, 3, 6, 7]
    }
}
