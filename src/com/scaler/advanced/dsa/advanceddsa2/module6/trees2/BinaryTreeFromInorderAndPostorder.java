package com.scaler.advanced.dsa.advanceddsa2.module6.trees2;

/**
 * Given the inorder and postorder traversal of a tree, construct the binary tree.
 *
 * NOTE: You may assume that duplicates do not exist in the tree.
 *
 * Example :
 * Input : A = [2, 1, 3]    B = [2, 3, 1]
 * Output :
 *    1
 *   / \
 *  2   3
 * Explanation : Create the binary tree and return the root node of the tree.
 * Output :
 *    1
 *   / \
 *  6   2
 *     /
 *    3
 *
 * Input : A = [6, 1, 3, 2] B = [6, 3, 2, 1]
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BinaryTreeFromInorderAndPostorder {
    private Map<Integer, Integer> inorderIndexMap; // To store inorder indices for quick lookup
    private int postorderIndex; // To keep track of the current index in postorder traversal


    public TreeNode buildTree(int[] inorder, int[] postorder) {
        // Create a HashMap to store indices of elements in the inorder traversal
        HashMap<Integer, Integer> inorderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        // Call the recursive build method to construct the tree
        return build(inorder, postorder, 0, inorder.length - 1, postorder.length - 1, inorderMap);
    }

    private TreeNode build(int[] inorder, int[] postorder, int inStart, int inEnd, int postEnd, HashMap<Integer, Integer> inorderMap) {
        // Base case: if the current inorder range is empty, return null
        if (inStart > inEnd) {
            return null;
        }
        // Create a TreeNode with the value at postorder[postEnd] (root of current subtree)
        TreeNode root = new TreeNode(postorder[postEnd]);
        // Find the index of the root value in the inorder traversal
        int rootIndexInInorder = inorderMap.get(root.val);
        // Calculate the number of elements in the right subtree
        int rightSubtreeSize = inEnd - rootIndexInInorder;

        // Recursively build the left subtree with updated indices
        root.left = build(inorder, postorder, inStart, rootIndexInInorder - 1, postEnd - rightSubtreeSize - 1, inorderMap);
        // Recursively build the right subtree with updated indices
        root.right = build(inorder, postorder, rootIndexInInorder + 1, inEnd, postEnd - 1, inorderMap);

        // Return the root of the subtree
        return root;
    }
    public static void main(String[] args) {

    }
}
