package com.scaler.advanced.dsa.advanceddsa2.module6.trees2;

/**
 * Given a root of binary tree A, determine if it is height-balanced.
 *
 * A height-balanced binary tree is defined as a binary tree in which the
 * depth of the two subtrees of every node never differ by more than 1.
 *
 * Example :
 * Input :
 *     1
 *    / \
 *   2   3
 * Output : 1
 * Explanation : It is a complete binary tree.
 *
 * Input :
 *        1
 *       /
 *      2
 *     /
 *    3
 * Output : 0
 * Explanation : Because for the root node, left subtree has depth 2 and right subtree has depth 0.
 * Difference = 2 > 1.
 *
 */
public class BalancedBinaryTree {
     boolean isHB = true;
    public  int isBalanced(TreeNode A) {
        height(A);
        if(isHB == false) return 0;
        return 1;
    }
    public  int height(TreeNode t){
        if(t == null) return -1;
        int hl = height(t.left);
        int hr = height(t.right);
        if(Math.abs(hl - hr) > 1) {
            isHB = false;
            return -1;
        }
        return 1 + Math.max(hl, hr);
    }
    public static void main(String[] args) {

    }
}
