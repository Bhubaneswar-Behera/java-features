package com.scaler.advanced.dsa.advanceddsa1.module5.recursion.two;

/**
 * Given a number A, check if it is a magic number or not.
 *
 * A number is said to be a magic number if the sum of its digits is calculated till a single digit recursively by adding the sum of the digits after every addition. If the single digit comes out to be 1,
 * then the number is a magic number.
 *
 * Input : A = 83557 Output : 1
 * Explanation :
 *   Sum of digits of (83557) = 28
 *  Sum of digits of (28) = 10
 *  Sum of digits of (10) = 1.
 *  Single digit is 1, so it's a magic number. Return 1.
 *
 * Input : A = 1291 Output : 0
 * Explanation :
 *  Sum of digits of (1291) = 13
 *  Sum of digits of (13) = 4
 *  Single digit is not 1, so it's not a magic number. Return 0.
 */
public class IsMagic {
    public static int solve(int A) {
        if(A == 0){
            return 0;
        }
        int sum = A% 10 + (A/10);
        if(sum > 9){
            sum = solve(sum);
        }
        return sum == 1 ? 1:0;
    }
    public static void main(String[] args) {
        int A = 83557;
        System.out.println(solve(A));
    }
}
