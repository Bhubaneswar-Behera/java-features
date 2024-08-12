package com.scaler.advanced.dsa.advanceddsa2.searching.two.binary.search.problems;

/**
 * You are given three positive integers, A, B, and C.
 * Any positive integer is magical if divisible by either B or C.
 * Return the Ath smallest magical number. Since the answer may be very large, return modulo 109 + 7.
 * Note: Ensure to prevent integer overflow while calculating.
 *
 * Input : A = 1 B = 2 C = 3    Output : 2
 * Explanation :
 *              1st magical number is 2.
 *
 * Input : A = 4 B = 2 C = 3    Output : 6
 * Explanation :
 *              First four magical numbers are 2, 3, 4, 6 so the 4th magical number is 6.
 *

 */
public class AthMagicalNumber {
    public static int solve(int A, int B, int C) {
        final long lcm = (B * C) / getHCD(B, C);
        long low = Math.min(B, C);
        long high = low * A;
        long answer = high;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long count = (mid / B) + (mid / C) - (mid / lcm);
            if (count < A){
                low = mid + 1;
            }else{
                answer = mid;
                high = mid - 1;
            }
        }
        return (int) (answer % 1000000007);
    }

    private static int getHCD(int A, int B){
        if(B == 0) return A;
        return getHCD(B, A % B);
    }
    public static void main(String[] args) {
        int A = 1;
        int B = 2;
        int C = 3;
        System.out.println(solve(A,B,C));
    }
}
