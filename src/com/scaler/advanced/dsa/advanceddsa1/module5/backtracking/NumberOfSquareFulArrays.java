package com.scaler.advanced.dsa.advanceddsa1.module5.backtracking;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Given an array of integers A, the array is squareful if for every pair of adjacent elements, their sum is a perfect square.
 * Find and return the number of permutations of A that are squareful. Two permutations A1 and A2 differ if and only if there is some index i such that A1[i] != A2[i].
 *
 * Input : A = [2, 2, 2]  Output : 1
 * Explanation : Only permutation is [2, 2, 2], the sum of adjacent element is 4 and 4 and both are perfect square.
 *
 * Input : A = [1, 17, 8]  Output : 2
 * Explanation : Permutation are [1, 8, 17] and [17, 8, 1].
 */
public class NumberOfSquareFulArrays {
    int ans = 0;
    int n;
    public boolean isPerfect(int n)
    {
        int sq = (int)Math.sqrt(n);
        return sq*sq == n;
    }
    public void solveFunc(HashMap<Integer, Integer> hm, ArrayList<Integer> curr)
    {
        if(curr.size() == n)
        {
            ans++;
            return;
        }
        for(Integer key:hm.keySet())
        {
            if(hm.get(key) != 0)
            {
                if(curr.size()==0?true:isPerfect(curr.get(curr.size()-1)+key) == true)
                {
                    curr.add(key);
                    hm.put(key,hm.get(key)-1);
                    solveFunc(hm,curr);
                    curr.remove(curr.size()-1);
                    hm.put(key,hm.get(key)+1);
                }
            }
        }
    }
    public int solve(ArrayList<Integer> A) {
        n = A.size();
        if(n == 1) return 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<A.size();i++)
        {
            hm.put(A.get(i),hm.getOrDefault(A.get(i),0)+1);
        }
        ArrayList<Integer> curr = new ArrayList<>();
        solveFunc(hm,curr);
        return ans;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(17);
        list.add(8);
        NumberOfSquareFulArrays obj = new NumberOfSquareFulArrays();
        System.out.println(obj.solve(list));
    }
}
