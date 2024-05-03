package com.scaler.advanced.dsa.module4.bit.maniplutaion.two;

/**
 * Given an array of positive integers A, two integers appear only once, and all the other integers appear twice.
 * Find the two integers that appear only once.
 *
 * Note: Return the two numbers in ascending order.
 *
 * Input : A = [1, 2, 3, 1, 2, 4] Output : [3, 4]
 * Explanation : 3 and 4 appear only once.
 *
 *Input : A = [1, 2] Output 2: [1, 2]
 * Explanation : 1 and 2 appear only once.
 *
 */
public class SingleNumberIII {
    public static int[] solve(int[] A) {
        int n=A.length;
//Step 1. find XOR of all the elements
        int x=0;
        for(int i=0;i<n;i++){
            x=x^A[i];
        }
// Step 2. find pos of first set bit in x
        int pos=0;
        for(int i=0;i<32;i++){
            if((x&(1<<i))>0){
                pos=i;
                break;
            }
        }
        //Step 3. Diffferentiate on the basis of whether bit is set or unset
        int set=0,unset=0;
        for(int i=0;i<n;i++){
            if((A[i] &(1<<pos))>0){
                set=set^A[i];
            }
            else{
                unset=unset^A[i];
            }
        }
        int[] ans=new int[2];
        if(unset> set){
            ans[0]=set;
            ans[1]=unset;
        }
        else{
            ans[0]=unset;
            ans[1]=set;
        }
        return ans;
    }


    public static boolean checkBits(int A,int i){
        if((A & (1 << i)) > 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] A = {186,256,102,377,186,377};
        int[] result = solve(A);
        for(int a : result){
            System.out.println(a+ " ");
        }
    }
}
