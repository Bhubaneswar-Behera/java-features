package com.scaler.advanced.dsa.advanceddsa3.module7.backtracking.two;

import java.util.ArrayList;

/**
 * You are climbing a staircase and it takes A steps to reach the top.
 * Each time you can either climb 1 or 2 steps.
 * In how many distinct ways can you climb to the top?
 * You need to return all the distinct ways to climb to
 * the top in lexicographical order.
 * Problem Constraints : 2 <= A <= 25
 *
 * Example :
 * Input : A = 2  Output : [ [1, 1], [2] ]
 * Explanation : Distinct ways to reach top: 1 + 1, 2.
 *
 * Input : A = 3  Output : [ [1, 1, 1], [1, 2], [2, 1] ]
 * Explanation : Distinct ways to reach top: 1 + 1 + 1, 1 + 2, 2 + 1.
 *
 *
 */
public class PrintPathsInStaircase {
    public ArrayList<ArrayList<Integer>> WaysToClimb(int A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> currentPath = new ArrayList<>();
        backtrack(A, 0, currentPath, result);
        return result;
    }
    // Backtracking function to generate all distinct ways
    private void backtrack(int A, int currentStep, ArrayList<Integer> currentPath, ArrayList<ArrayList<Integer>> result) {
        if (currentStep == A) {
            // If we've reached exactly A steps, add the current path (copy) to result
            result.add(new ArrayList<>(currentPath));
            return;
        }

        if (currentStep > A) {
            return; // If we exceed the steps, return
        }

        // Try taking 1 step
        currentPath.add(1);
        backtrack(A, currentStep + 1, currentPath, result);
        currentPath.remove(currentPath.size() - 1); // Backtrack

        // Try taking 2 steps
        currentPath.add(2);
        backtrack(A, currentStep + 2, currentPath, result);
        currentPath.remove(currentPath.size() - 1); // Backtrack
    }
    public static void main(String[] args) {

    }
}
