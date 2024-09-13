package com.scaler.advanced.dsa.advanceddsa2.module6.trees2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Given a binary tree of integers denoted by root A.
 * Return an array of integers representing the right view of the Binary tree.
 * Right view of a Binary Tree is a set of nodes visible when the tree is visited from Right side.
 *
 * Input :
 *             1
 *           /   \
 *          2    3
 *         / \  / \
 *        4   5 6  7
 *       /
 *      8
 * Output : [1, 3, 7, 8]
 * Explanation : Right view is described.
 *
 * Input :
 *             1
 *            /  \
 *           2    3
 *            \
 *             4
 *              \
 *               5
 * Output : [1, 3, 4, 5]
 * Explanation : Right view is described.
 *
 */
public class RightViewOfBinaryTree {
    public ArrayList<Integer> solve(TreeNode A) {
        ArrayList<Integer>list=new ArrayList<>();
        Queue<TreeNode>que=new LinkedList<>();
        que.add(A);
        while(que.size()>0){
            int size=que.size();
            for(int i=1;i<=size;i++){
                TreeNode temp = que.poll();
                if(i==size)
                    list.add(temp.val);
                if(temp.left!=null){
                    que.add(temp.left);
                }
                if(temp.right!=null){
                    que.add(temp.right);
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {

    }
}
