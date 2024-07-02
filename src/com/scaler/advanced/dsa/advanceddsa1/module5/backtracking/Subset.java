package com.scaler.advanced.dsa.advanceddsa1.module5.backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given a set of distinct integers A, return all possible subsets.
 *
 * NOTE:
 * Elements in a subset must be in non-descending order.
 * The solution set must not contain duplicate subsets.
 * Also, the subsets should be sorted in ascending ( lexicographic ) order.
 * The initial list is not necessarily sorted.
 *
 * Input : A = [1]
 * Output :
 *   [
 *     []
 *     [1]
 *     ]
 * Explanation : You can see that these are all possible subsets.
 *
 * Input : A = [1, 2, 3]
 * Output :
 *  [
 *   []
 *   [1]
 *   [1, 2]
 *   [1, 2, 3]
 *   [1, 3]
 *   [2]
 *   [2, 3]
 *   [3]
 *  ]
 * Explanation : You can see that these are all possible subsets.
 *
 */
public class Subset {

    static ArrayList<ArrayList<Integer>> result = new ArrayList<>();

    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        Collections.sort(A);
        findSubsets(A, new ArrayList<Integer>(), 0);
        return result;
    }

    public static void findSubsets(ArrayList<Integer> A, ArrayList<Integer> temp, int index) {
        result.add(new ArrayList<>(temp));

        for (int i = index; i < A.size(); i++) {
            temp.add(A.get(i));
            findSubsets(A, temp, i + 1);
            temp.remove(temp.size() - 1);
        }
    }

    public static void printAllSubsets(int[] A, int index , List<Integer> list){
        if(index == A.length){
            System.out.println(list);
            return;
        }
        list.add(A[index]);
        printAllSubsets(A,index+1,list);
        list.remove(list.size() - 1);
        printAllSubsets(A,index+1,list);
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        List<Integer> arrayList = new ArrayList<>();
        printAllSubsets(A,0,arrayList);
        System.out.println("###########################################");
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);

        ArrayList<ArrayList<Integer>> resultList = subsets(integerArrayList);
        for (ArrayList<Integer> output : resultList) {
            System.out.println(output);
        }

    }
}
