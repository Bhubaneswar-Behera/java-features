package com.scaler.advanced.dsa.advanceddsa1.module5.recursion.two;

import java.util.ArrayList;

public class Main {

    private static void printTowerOfHanoi(int number, char source, char auxilary, char destination) {
        if (number == 0) {
            return;
        }
        printTowerOfHanoi(number - 1 , source,auxilary,destination );
        System.out.println(source +"-->"+destination);
        printTowerOfHanoi(number-1,auxilary,source,destination);
    }

    public static ArrayList<ArrayList<Integer>> towerOfHanoi(int A) {
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
        tower(A, answer,1,2,3);
        return answer;
    }

    private static void tower(int A,ArrayList<ArrayList<Integer>> answer, int source, int auxilary,
                              int destination) {
        if (A == 0) {
            return;
        }
        tower(A-1,answer,source,destination,auxilary);
        ArrayList<Integer> val = new ArrayList<>();
        val.add(A);
        val.add(source);
        val.add(auxilary);
        val.add(destination);
        answer.add(val);
        tower(A-1,answer,auxilary,source,destination);
    }

    public static void main(String[] args) {
        int number = 3;
        printTowerOfHanoi(number,'A','B','C');

        int N = 2;
        System.out.println(towerOfHanoi(N));
    }

}
