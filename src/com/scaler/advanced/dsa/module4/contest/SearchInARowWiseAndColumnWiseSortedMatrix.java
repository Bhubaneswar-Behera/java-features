package com.scaler.advanced.dsa.module4.contest;

public class SearchInARowWiseAndColumnWiseSortedMatrix {

    public static int solve(int[][] A, int B) {
        int n = A.length;
        int m = A[0].length;

        int answer = Integer.MAX_VALUE;
        int  i = 0;
        int j = m -1 ;

        while(i < n && j >=0){
            if(A[i][j] == B){
                answer = Math.min(answer,(i+1)*1009+(j+1));
            }
            if(B > A[i][j]){
                i++;
            } else{
                j--;
            }
        }
        return answer == Integer.MAX_VALUE ? -1 : answer;


    }
    public static void main(String[] args) {
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        int B = 2;

        System.out.println(solve(A,B));

    }
}
