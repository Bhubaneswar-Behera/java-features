package com.scaler.intermediate.dsa.interview.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Given a number A, find if it is COLORFUL number or not.If number A is a COLORFUL number return 1 else, return 0.
 *
 * What is a COLORFUL Number:
 *
 * A number can be broken into different consecutive sequence of digits.
 * The number 3245 can be broken into sequences like 3, 2, 4, 5, 32, 24, 45, 324, 245 and 3245.
 * This number is a COLORFUL number, since the product of every consecutive sequence of digits is different
 *
 * Input : A = 23  Output : 1
 * Explanation 1:
 * Possible Sub-sequences: [2, 3, 23] where
 *  2 -> 2
 *  3 -> 3
 *  23 -> 6  (product of digits)
 *  This number is a COLORFUL number since product of
 *  every digit of a sub-sequence are different.
 *
 * Input : A = 236 Output : 0
 * Possible Sub-sequences: [2, 3, 6, 23, 36, 236] where
 *  2 -> 2
 *  3 -> 3
 *  6 -> 6
 *  23 -> 6  (product of digits)
 *  36 -> 18  (product of digits)
 *  236 -> 36  (product of digits)
 *  This number is not a COLORFUL number since the
 *  product sequence 23  and sequence 6 is same.
 */
public class ColorfulNumber {
    public static int colorful(int A) {
        List<Integer> list = new ArrayList<>();
        while(A != 0){
            list.add(A % 10);
            A = A / 10;
        }
        int n = list.size();
        HashSet<Integer> hashSet = new HashSet();
        for (int i = 0; i < n ;i++) {
            int product  =1;
            for(int j = i ;j< n;j++){
                product = product * list.get(j);
                if(hashSet.contains(product)){
                    return 0;
                } else{
                    hashSet.add(product);
                }
            }
        }

        return 1;
    }
    public static void main(String[] args) {
        int A = 23;
        System.out.println(colorful(A));
    }
}
