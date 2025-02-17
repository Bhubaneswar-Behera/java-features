package com.scaler.advanced.dsa.advanceddsa1.module5.recursion.two;

import java.util.ArrayList;
import java.util.List;

public class FindAllIndices {
    public static ArrayList<Integer> occurrence(int[] A ,int  B , int index , ArrayList<Integer> list){
        if (index == B){
            return list;
        }
        list.add(index);
        return occurrence(A,B,index+1,list);
    }

    public static ArrayList<Integer> allIndices(ArrayList<Integer> A, int B) {
        int n=A.size()-1;
        ArrayList<Integer> ans=new ArrayList<Integer>();
        return find(A,B,n,ans);
    }

    public static ArrayList<Integer> find(ArrayList<Integer> A,int B,int n,ArrayList<Integer> ans) {

        if (n < 0) {
            return ans;
        } else {
            if (A.get(n) == B) {
                ans.add(n);
            }
            return find(A, B, n - 1, ans);
        }
    }

    public static int getMaxHelper(int[] A, int start, int end) {

        if (start == end) {
            return A[start];
        }


        int mid = (start + end) / 2;


        int max1 = getMaxHelper(A, start, mid);
        int max2 = getMaxHelper(A, mid + 1, end);


        return Math.max(max1, max2);
    }

    public static void PrintArray(int[] A) {
        printElements(A,0);
        System.out.println();
    }
    public static void printElements(int A[],int i){
        if(i==A.length){
            return;
        }
        System.out.print(A[i]+" ");
        printElements(A,i+1);
    }
    public static void main(String[] args) {
        int[] A = {4,5,3,1,5,4,5};
        int B = 5;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(occurrence(A,B,-1,list));
    }
}

