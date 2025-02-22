package com.scaler.advanced.dsa.advanceddsa2.module6.trees2;

/**
 * Given a binary tree, return the level order traversal of its nodes' values.
 * (i.e., from left to right, level by level).
 *
 * Example :
 * Input 1:
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * Output :
 *   [
 *    [3],
 *    [9, 20],
 *    [15, 7]
 *  ]
 *
 * Explanation :
 * Return the 2D array. Each row denotes the traversal of each level.
 *
 * Input 2:
 *
 *    1
 *   / \
 *  6   2
 *     /
 *    3
 * Output :
 *  [
 *     [1]
 *     [6, 2]
 *     [3]
 *   ]
 *
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {

    public ArrayList<ArrayList<Integer>> solve(TreeNode A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (A == null) return result;

        // Initialize the queue for BFS
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(A);

        // Perform BFS
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            ArrayList<Integer> levelValues = new ArrayList<>();

            // Process each node at the current level
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                levelValues.add(node.val);

                // Enqueue child nodes
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }

            // Add current level's values to the result
            result.add(levelValues);
        }

        return result;

    }
    public static void main(String[] args) {

    }
}
