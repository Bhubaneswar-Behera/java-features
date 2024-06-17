package com.scaler.advanced.dsa.module5.searching.three.binary.search.on.answer;

/**
 * Given an array of integers A and an integer B, find and return the maximum
 * value K such that there is no subarray in A of size K with the sum of elements greater than B.
 *
 * Problem Constraints
 * 1 <= |A| <= 100000
 * 1 <= A[i] <= 10^9
 *
 * 1 <= B <= 10^9
 *
 *
 * Input : A = [1, 2, 3, 4, 5]  B = 10  Output : 2
 * Input : A = [5, 17, 100, 11] B = 130  Output : 3
 */
public class SpecialInteger {

    public static int solve(int[] A, int B) {
        int n = A.length;
        int l = 0;
        int h = n;
        int answer = 1;
        while(l<=h){
            int mid=l + (h-l) / 2;
            if(isValidSum(mid, A,B , n)){
                answer = mid;
                l = mid + 1;
            }else{
                h = mid - 1;
            }
        }
        return answer;
    }

    public static boolean isValidSum(int m, int[] A, int B, int n) {
        long sum = 0;

        for(int i = 0; i < m; i++) {
            sum = sum + A[i];
        }

        if(sum > B) {
            return false;
        }

        int start = 1;
        int end = m;
        while(end < n) {
            sum = sum - A[start-1] + A[end];
            if(sum > B) {
                return false;
            }
            start++;
            end++;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int B = 10;
        System.out.println(solve(A,B));
    }
}
