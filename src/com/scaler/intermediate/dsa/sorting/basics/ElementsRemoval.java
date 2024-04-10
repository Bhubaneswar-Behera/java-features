package com.scaler.intermediate.dsa.sorting.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Given arr[n],we need to minimize the total cost of emptying the array.
 * The cost of removing one element is defined as the sum of all
 * remaining elements in the array at the time of removal.
 *
 * eg:
 * Input  : A {1,2,4}
 * Output : 11
 * Explanation :    2--> 2 +1 +4=7
 *                  1-->1+4=5        Cost = 7+5+4 = 16
 *                  4-->4
 *
 *                  4-->1+2+4=7
 *                  2-->1+2=3        Cost = 7 + 3 + 1 =11
 *                  1-->1
 *
 */
public class ElementsRemoval {

    public static int solution(int[] arr, int n){
        int answer = 0;

        Integer[] array = convert(arr);

        //sorted descending order
        Arrays.sort(array,Collections.reverseOrder());

        for (int i =0;i < n ;i++) {
            answer = answer + array[i] * (i + 1);
        }
       return answer;
    }

    public static int solve(ArrayList<Integer> A) {
        int n = A.size();
        Collections.sort(A,Collections.reverseOrder());
        int answer = 0;
        for(int i = 0 ;i < n ;i++){
            answer = answer + A.get(i) * (i+1);
        }
        return answer;
    }
    public static Integer[] convert(int[] arr){
        return Arrays.stream(arr).boxed().toArray(Integer[]::new);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4};
        int n = arr.length;
        System.out.println(solution(arr,n));

        ArrayList arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(4);
        System.out.println(solve(arrayList));
    }
}
