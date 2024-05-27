package com.scaler.intermediate.dsa.module2.arrays.carry.forward.and.subarrays;

import java.util.ArrayList;

/**
 * Given arr[n] , return the length of the smallest
 * subarray which contains both the minimum and maximum of the array.
 *
 * Example :
 * Input : A[] = {2, 2, 6, 4, 5, 2, 6, 4, 1} Output : 3
 * Explanation :
 * min is 1 ,max is 6 --> smallest subarray is [6,4,1]  --> length is 3
 *
 */
public class ClosestMinMax {

    public static int solve(int[] A) {
        int n = A.length;
        int max = maxElement(A);
        int min = minElement(A);
        int lastMinIndex = -1;
        int lastMaxIndex = -1;
        int answer = Integer.MAX_VALUE;

        for(int i = 0 ; i < n;i++){

            if(A[i] == min){
                lastMinIndex = i;
                if(lastMaxIndex != -1){
                    answer = Math.min(answer, i - lastMaxIndex +1);
                }
            }
            if(A[i] == max){
                lastMaxIndex = i;
                if(lastMinIndex != -1){
                    answer = Math.min(answer,i - lastMinIndex + 1);
                }
            }
        }
        return answer;
    }

    public static int solve(ArrayList<Integer> A) {
        int n = A.size();
        int minIndex = -1;
        int maxIndex = -1;
        int answer = Integer.MAX_VALUE;
        int max = getMax(A);
        int min = getMin(A);

        for(int i = 0 ;i < n ; i++){
            if(A.get(i) == min){
                minIndex = i;
                if(maxIndex != -1){
                    answer = Math.min(answer,i - maxIndex+1);
                }
            }
            if(A.get(i) == max) {
                maxIndex = i;
                if(minIndex != -1){
                    answer = Math.min(answer, i - minIndex +1);
                }
            }
        }
        return answer;
    }

    public static int minElement(int[] A){
        int min = Integer.MAX_VALUE;

        for(int a: A){
            min = Math.min(min, a);
        }
        return min;
    }

    public static int maxElement(int[] A){
        int max = Integer.MIN_VALUE;

        for(int a: A){
            max = Math.max(max, a);
        }
        return max;
    }

    public static int minSubArrayLengthBruteForce(int[] arr, int n){
        //check all the sub arrays and find the answer
        return  -1;
    }



    public static int getMax(ArrayList<Integer> A){
        int max = Integer.MIN_VALUE;

        for(int a : A){
            max = Math.max(max,a);
        }
        return max;
    }
    public static int getMin(ArrayList<Integer> A){
        int min = Integer.MAX_VALUE;

        for(int a : A){
            min = Math.min(min,a);
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,6,4,5,2,6,4,1};
        //int n = arr.length;
        //System.out.println(minSubArrayLength(arr,n));

        int[] A = {1, 3, 2};
        System.out.println(solve(arr));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(814);
        list.add(761);
        list.add(697);
        list.add(483);
        list.add(981);
        System.out.println(solve(list));

    }
}
