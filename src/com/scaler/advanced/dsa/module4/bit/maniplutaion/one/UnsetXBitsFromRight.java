package com.scaler.advanced.dsa.module4.bit.maniplutaion.one;

/**
 * Given an integer A. Unset B bits from the right of A in binary.
 *
 * For example, if A = 93 and B = 4, the binary representation of A is 1011101.
 * If we unset the rightmost 4 bits, we get the binary number 1010000, which is equal to the decimal value 80.
 *
 * Input 1: A = 25 B = 3
 * Output : 24
 * Explanation : A = 11001 to 11000
 *
 *
 * Input 2: A = 37 B = 3
 * Output : 32
 * Explanation 2: A = 100101 to 100000
 */
public class UnsetXBitsFromRight {
    public static long solve(long A, int B) {
        int i = 0;
        while (B > i) {
            if((A & (1 << i)) != 0){
                A = (A ^( 1<<i));
            }
            i++;
        }
        return A;
    }
    public static void main(String[] args) {
        int A = 37;
        int B = 3;
        System.out.println(solve(A,B));
    }
}
