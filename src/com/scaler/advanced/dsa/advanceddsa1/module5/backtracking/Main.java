package com.scaler.advanced.dsa.advanceddsa1.module5.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void printValidParentheses(int n, int openingBracket , int closingBracket, char[] str){
        int index = openingBracket + closingBracket;

        if (index == 2*n) {
            System.out.println(str);
            return;
        }

        if (openingBracket > closingBracket) {
            str[index] = ')';
            printValidParentheses(n,openingBracket,closingBracket + 1,str);
        }
        if (openingBracket < n) {
            str[index] = '(';
            printValidParentheses(n,openingBracket+1,closingBracket,str);
        }

    }

    public static void printAllSubSets(int[] A, int index , List<Integer> list){
        if(index == A.length){
            System.out.println(list);
            return;
        }
        list.add(A[index]);
        printAllSubSets(A,index+1,list);
        list.remove(list.size()-1);
        printAllSubSets(A,index+1,list);

    }
    public static void main(String[] args) {
        int n = 3;
        //printValidParentheses(n , 0 , 0 , new char[2*n]);
        int[] A = {10,20,30};
        List<Integer> list = new ArrayList<>();
        printAllSubSets(A,0, list);
    }
}
