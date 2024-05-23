package com.scaler.advanced.dsa.module4.backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array A of size N denoting collection of numbers , return all possible permutations.
 *
 * NOTE:
 *
 * No two entries in the permutation sequence should be the same.
 * For the purpose of this problem, assume that all the numbers in the collection are unique.
 * Return the answer in any order
 * WARNING: DO NOT USE LIBRARY FUNCTION FOR GENERATING PERMUTATIONS.
 * Example : next_permutations in C++ / itertools.permutations in python.
 * If you do, we will disqualify your submission retroactively and give you penalty points.
 *
 * Input A = [1, 2, 3]
 * Output
 *  [ [1, 2, 3]
 *   [1, 3, 2]
 *   [2, 1, 3]
 *   [2, 3, 1]
 *   [3, 1, 2]
 *   [3, 2, 1] ]
 *
 *
 * Example Explanation
 * All the possible permutation of array [1, 2, 3].
 */
public class Permutations {

    public static void printPermutation(String str, int strLength , String permutation,Set<Character> hashSet){
        if (permutation.length() == strLength) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < strLength; i++) {
            if (!hashSet.contains(str.charAt(i))) {
                hashSet.add(str.charAt(i));
                printPermutation(str,strLength,permutation + str.charAt(i),hashSet);
                hashSet.remove(str.charAt(i));
            }
        }
    }


    public static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        Set<Integer> hashSet = new HashSet<>();
        ArrayList<ArrayList<Integer>> permutations = new  ArrayList<ArrayList<Integer>>();
        int size = A.size();
        ArrayList<Integer> list= new ArrayList<>();
        generatePermutation(permutations,hashSet,size,A,list);

        return permutations;

    }
    public static void generatePermutation(ArrayList<ArrayList<Integer>> permutations,Set<Integer> hashSet,
                                    int size,ArrayList<Integer> A, ArrayList<Integer> list){

        if(hashSet.size() == size){
            ArrayList<Integer> latestList = new ArrayList<>(list);
            permutations.add(latestList);
            return ;
        }
        for (int i = 0; i < A.size();i++){
            if(!hashSet.contains(A.get(i))){
                hashSet.add(A.get(i));
                list.add(A.get(i));
                generatePermutation(permutations, hashSet,size,A,list);
                list.remove(list.size()-1);
                hashSet.remove(A.get(i));
            }
        }
    }


    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        ArrayList<ArrayList<Integer>> arrayListArrayList = permute(A);
        for (ArrayList<Integer> list: arrayListArrayList) {
            System.out.println(list);
        }

        System.out.println("#######################################################");
        String str = "abc";
        int n = str.length();
        String permutation = "";
        Set<Character> hashSet = new HashSet<>();
        printPermutation(str,n,permutation,hashSet);
    }
}
