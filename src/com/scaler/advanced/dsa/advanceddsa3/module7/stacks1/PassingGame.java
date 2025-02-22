package com.scaler.advanced.dsa.advanceddsa3.module7.stacks1;

import java.util.Stack;

/**
 * There is a football event going on in your city. In this event, you are given A passes and players having ids between 1 and 106.
 * Initially, some player with a given id had the ball in his possession. You have to make a program to display the id of the player who possessed the ball after exactly A passes.
 * There are two kinds of passes:
 *
 * 1) ID
 *
 * 2) 0
 *
 * For the first kind of pass, the player in possession of the ball passes the ball "forward" to the player with id = ID.
 * For the second kind of pass, the player in possession of the ball passes the ball back to the player who had forwarded the ball to him.
 * In the second kind of pass "0" just means Back Pass.
 *
 * Return the ID of the player who currently possesses the ball.
 *
 * Input:   A = 10 B = 23 C = [86, 63, 60, 0, 47, 0, 99, 9, 0, 0]
 * Output : 63
 *
 * Input : A = 1 B = 1   C = [2]
 *  Output : 2
 */
public class PassingGame {
    public static int solve(int A, int B, int[] C) {
        int n = C.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(C[i]!=0) {
                st.push(C[i]);
            }
            else {
                st.pop();
            }

        }
        if(st.size()==0) {
            return B;
        }
        return st.peek();
    }
    public static void main(String[] args) {
        int A = 10;
        int B = 23;
        int[] C = {86, 63, 60, 0, 47, 0, 99, 9, 0, 0};
        System.out.println(solve(A,B,C));
    }
}
