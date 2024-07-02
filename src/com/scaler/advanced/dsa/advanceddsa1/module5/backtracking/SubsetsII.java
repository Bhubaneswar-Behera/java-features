package com.scaler.advanced.dsa.advanceddsa1.module5.backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

/**
 * Given a collection of integers denoted by array A of size N that might contain duplicates,
 * return all possible subsets.
 *
 * NOTE:
 * Elements in a subset must be in non-descending order.
 * The solution set must not contain duplicate subsets.
 * The subsets must be sorted lexicographically.
 *
 * Input : A = [1, 2, 2]
 * Output :
 *  [
 *      [],
 *      [1],
 *      [1, 2],
 *      [1, 2, 2],
 *      [2],
 *      [2, 2]
 *  ]
 * Explanation :All the subsets of the array [1, 2, 2] in lexicographically sorted order.
 *
 * Input : A = [1, 1]
 * Output :
 * [
 *     [],
 *     [1],
 *     [1, 1]
 *  ]
 *
 */
public class SubsetsII {
    public static ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> A) {
        LinkedHashSet<ArrayList<Integer>> ans = new LinkedHashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        ans.add(new ArrayList<Integer>());
        Collections.sort(A);
        generate(A,list,ans,0);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(ArrayList<Integer> itr : ans){
            res.add(itr);
        }
        return res;
    }
    public static void generate(ArrayList<Integer> A,ArrayList<Integer> list,LinkedHashSet<ArrayList<Integer>> ans,int idx ){
        if(idx==A.size()){
            return ;
        }
        list.add(A.get(idx));
        ans.add(new ArrayList<Integer>(list));
        generate(A,list,ans,idx+1);

        list.remove(list.size()-1);

        generate(A,list,ans,idx+1);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        ArrayList<ArrayList<Integer>> result = subsetsWithDup(list);
        for (ArrayList<Integer> a : result) {
            System.out.println(a);
        }


    }
}
