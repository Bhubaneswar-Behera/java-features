package com.scaler.advanced.dsa.module4.backtracking;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Given an array A of size N denoting collection of numbers that might contain duplicates,
 * return all possible unique permutations.
 *
 * NOTE: No 2 entries in the permutation sequence should be the same.
 *
 * WARNING: DO NOT USE LIBRARY FUNCTION FOR GENERATING PERMUTATIONS.
 * Example : next_permutations in C++ / itertools.permutations in python.
 * If you do, we will disqualify your submission retroactively and give you penalty points.
 *
 * Input : A = [1, 1, 2]
 * Output :
 *      [ [1,1,2]
 *      [1,2,1]
 *      [2,1,1] ]
 * Explanation : All the possible unique permutation of array [1, 1, 2].
 *
 *
 * Input : A = [1, 2]
 * Output 2:
 *      [ [1, 2]
 *      [2, 1] ]
 *  Explanation : All the possible unique permutation of array [1, 2].
 *
 *
 */
public class AllUniquePermutations {
    static ArrayList<ArrayList<Integer>> finalAnswer = new ArrayList<>();
    public static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        // Create a frequency map to keep track of the count of each element
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < A.size(); i++) {
            freqMap.put(A.get(i), freqMap.getOrDefault(A.get(i), 0) + 1);
        }

        int n = A.size();
        findPermutations(freqMap, 0, new ArrayList<Integer>(), n);
        return finalAnswer;
    }

    public static void findPermutations(HashMap<Integer, Integer> freqMap, int index, ArrayList<Integer> temp, int n) {
        // Base case: If all positions in the temporary array are filled
        if (index >= n) {
            finalAnswer.add(new ArrayList<>(temp));
            return;
        }

        // Iterate over the elements in the frequency map
        for (int i : freqMap.keySet()) {
            if (freqMap.get(i) > 0) {
                temp.add(i); // Add the current element to the temporary array
                freqMap.put(i, freqMap.get(i) - 1); // Decrement the count of the element in the frequency map

                // Recursive call to fill the next position in the temporary array
                findPermutations(freqMap, index + 1, temp, n);

                freqMap.put(i, freqMap.get(i) + 1); // Restore the count of the element in the frequency map
                temp.remove(temp.size() - 1); // Remove the current element from the temporary array for backtracking
            }
        }
    }
    public static void main(String[] args) {
        int[] A =  {1, 1, 2};
        ArrayList list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);

        ArrayList<ArrayList<Integer>> result = permute(list);

        for (ArrayList<Integer> a : result) {
            System.out.println(a);
        }

    }
}
