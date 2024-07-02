package com.scaler.advanced.dsa.advanceddsa1.module5.arrays.interview.problems;

import java.util.ArrayList;

/**
 * You are given a collection of intervals A in a 2-D array format, where each interval
 * is represented by a pair of integers `[start, end]`. The intervals are sorted based on their start values.
 * Your task is to merge all overlapping intervals and return the resulting set of non-overlapping intervals.
 *
 * Input 1: [ [1, 3], [2, 6], [8, 10], [15, 18]] Output : [ [1, 6], [8, 10], [15, 18]]
 * Explanation : Merge intervals [1,3] and [2,6] -> [1,6].
 * so, the required answer after merging is [1,6],[8,10],[15,18].
 * No more overlapping intervals present.
 *
 *
 *
 * Input 2: [ [2, 10], [4, 9], [6, 7] ] Output 2: [ [2, 10] ]
 * Explanation 2:
 *  Merge intervals [2, 10], [4, 9], [6, 7] as [2,10].
 *  Since [4, 9] and [6, 7] is overlapping inside the interval [2, 10].
 *  so, the required answer after merging is [2, 10].
 */
public class MergeSortedOverlappingIntervals {

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>>ans = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> current = new ArrayList<>();
        current = A.get(0);
        int n = A.size();
        for(int i = 1 ; i < n ;i++){
            ArrayList<Integer> temp = A.get(i);
            if(temp.get(0) <= current.get(1)){
                current.set(0,Math.min(current.get(0),temp.get(0)));
                current.set(1,Math.max(current.get(1),temp.get(1)));
            }
            else{
                ans.add(current);
                current = temp;
            }
        }
        ans.add(current);
        return ans;

    }

    public static ArrayList<ArrayList<Integer>> solve1(int[][] A) {
        int n = A.length;
        ArrayList<ArrayList<Integer>> answer = new ArrayList<ArrayList<Integer>>();

        int s1 = A[0][0];
        int e1 = A[0][1];

        for (int i = 1; i < n ; i++) {

        }

        return answer;
    }
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> integerArrayList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(10);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(9);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(6);
        list3.add(7);

        integerArrayList.add(list1);
        integerArrayList.add(list2);
        integerArrayList.add(list3);

        System.out.println(solve(integerArrayList));

    }
}
