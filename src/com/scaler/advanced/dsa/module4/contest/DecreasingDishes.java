package com.scaler.advanced.dsa.module4.contest;

public class DecreasingDishes {


    public static int solve(int[] A,int n){

        int max = A[0];
        int previous = A[0];
        int sum = A[0];

        for(int i = 1;i < n ;i++){
            if(A[i] < previous){
                sum = sum + A[i];
                previous = A[i];
            }
            else{
                max = Math.max(max,sum);
                previous = A[i];
                sum = A[i];
            }
        }
        max = Math.max(max,sum);

        return max;

    }
    public static void main(String[] args) {
        int[] A = {10,4,9,1,3,5};
        //int[] A = {4,10,1,6,3,3};

        System.out.println(solve(A,A.length));
    }
}
