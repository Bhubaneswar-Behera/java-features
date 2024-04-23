package com.scaler.advanced.dsa.module4.arrays.one.dimensional;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given a non-negative number represented as an array of digits,
 * add 1 to the number ( increment the number represented by the digits ).
 *
 * The digits are stored such that the most significant digit is at the head of the list.
 *
 * NOTE: Certain things are intentionally left unclear in this
 * question which you should practice asking the interviewer.
 * For example: for this problem, the following are some good questions to ask :
 *
 * Q: Can the input have 0's before the most significant digit. Or, in other words, is 0 1 2 3 a valid input?
 * A: For the purpose of this question, YES
 * Q: Can the output have 0's before the most significant digit? Or, in other words, is 0 1 2 4 a valid output?
 * A: For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.
 *
 *
 */
public class AddOneToNumber {
    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int N = A.size();
        int count = 0;

        // check and eliminate if there is any 0's in the start
        while(A.get(0)==0 && A.size()>1){
            A.remove(0);
            count++;  // note down the number of digits deducted
        }

        for(int i=N-1-count;i>=0;i--){

            // checking the digits for last to first;
            if(A.get(i)<9){

                //if the digit is less than 9, can increment by one and simply return
                A.set(i,A.get(i)+1);
                return A;
            }else{
                // if it is 9, then make it zero and the loop goes to increase the left digit
                A.set(i,0);
            }
        }

        // if it reaches here, it means the all the elements in the array is now 0;
        //  need to a digits to the start of the array and the current leght of the array will be increased by one.
        A.add(0);
        A.set(0,1);

        return A;
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(plusOne(list));
    }
}
