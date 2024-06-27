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
 * Input : [1, 2, 3]
 * Output : [1, 2, 4]
 * Explanation : Given vector is [1, 2, 3]. The returned vector should be [1, 2, 4] as 123 + 1 = 124.
 */
public class AddOneToNumber {
    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        //Remove initial zeros 00123->123
        while(A.get(0)==0 && A.size()>1){
            A.remove(0);
        }

        int N = A.size();
        for(int i = N-1; i>=0; i--){

            //if nos is 123-> get the last bit increment by one and return.
            if(A.get(i)<9){
                A.set(i,A.get(i)+1);
                return A;
            }
            //if the last bit is 9 then set it to zero, in the next iteration, one will be added at 10's place
            A.set(i,0);
        }
        //Coming out of the above loop means , all the digits were 9's..couldnot return so we need to add a 1 at index 0 and return the ans
        A.add(0,1);
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
