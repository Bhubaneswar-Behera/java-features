package com.scaler.intermediate.dsa.arrays.introduction;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateArrayKTimes {

    public static void rotateArrayBruteforce(int[] arr,int n ,int k){
        for(int i = 0 ; i < k;i++){
            int temp  = arr[n - 1];
            for(int j = n-1 ; j >= 1 ; j--){
                    arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }
    }
    public static void rotateArrayOptimized(int[] arr, int n,int k){
        k =  k%arr.length;
        rotate(arr , n ,0,n-1);
        rotate(arr,n,0,k-1);
        rotate(arr,n,k,n-1);
    }

    public static void rotate(int[] arr, int n , int l ,int r  ){
        int i = l;
        int j = r;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int k = 2;
        /*rotateArrayBruteforce(arr,n,k);
        System.out.println(Arrays.toString(arr));*/
        System.out.println("Original Array : \n" + Arrays.toString(arr));
        rotateArrayOptimized(arr,n ,k);
        System.out.println("Rotated Array : \n"+Arrays.toString(arr));


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original List : \n" + list);
        solve(list,k);
        System.out.println("Rotated List : \n" + list);
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A,   int B) {
        int n = A.size();
        B = B % n;
        rotate(A, 0 , n-1);
        rotate(A,0,B-1);
        rotate(A,B, n -1);
        return A;
    }

    public static void rotate(ArrayList<Integer> A,int left , int right){
        int  i = left;
        int j = right;
        while(i < j){

            //Collections.swap(A, i ,j);
            int temp = A.get(i);
            A.set(i,A.get(j));
            A.set(j,temp);

           /* int first = A.get(i);
            int second  = A.get(j);

            Collections.sw
            int temp = first;
            A.add(i,f);
            first = A.get(i);
            second = temp;*/
            i++;
            j--;
        }
    }



}
