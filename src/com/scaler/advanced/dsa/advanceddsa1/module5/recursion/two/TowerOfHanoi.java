package com.scaler.advanced.dsa.advanceddsa1.module5.recursion.two;

import java.util.ArrayList;

/**
 * In the classic problem of the Towers of Hanoi, you have 3 towers numbered from 1 to 3 (left to right) and A disks numbered from 1 to A (top to bottom) of different sizes which can slide onto any tower.
 * The puzzle starts with disks sorted in ascending order of size from top to bottom (i.e., each disk sits on top of an even larger one).
 * You have the following constraints:
 *
 * Only one disk can be moved at a time.
 * A disk is slid off the top of one tower onto another tower.
 * A disk cannot be placed on top of a smaller disk.
 * You have to find the solution to the Tower of Hanoi problem.
 * You have to return a 2D array of dimensions M x 3, where M is the minimum number of moves needed to solve the problem.
 * In each row, there should be 3 integers (disk, start, end), where:
 *
 * disk - number of the disk being moved
 * start - number of the tower from which the disk is being moved
 * end - number of the tower to which the disk is being moved
 *
 * Input : A = 2  Output : [1 1 2 ] [2 1 3 ] [1 2 3 ]
 * Explanation :
 * We shift the first disk to the middle tower.
 * We shift the second disk to the last tower.
 * We, finally, shift the first disk from the middle tower to the last tower.
 *
 * Input : A = 3 Output : [1 1 3 ] [2 1 2 ] [1 3 2 ] [3 1 3 ] [1 2 1 ] [2 2 3 ] [1 1 3 ]
 * Explanation :
 * We can see that this was the only unique path with minimal
 * moves to move all disks from the first to the third tower.
 */
public class TowerOfHanoi {

    public static void printTowerOfHanoi(int A, char source,char auxilary ,  char destination){
        if (A == 0) {
            return;
        }
        printTowerOfHanoi(A - 1 , source,auxilary,destination);
        System.out.println(source + "-->"+destination);
        printTowerOfHanoi(A-1 , auxilary,source,destination);

    }
    public static ArrayList<ArrayList<Integer>> towerOfHanoi(int A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        tower(A,1,2,3,ans);

        return ans;
    }
    public static void tower(int N,int source, int auxilary, int destination, ArrayList<ArrayList<Integer>> ans){
        if(N==0){
            return;
        }
        tower(N-1,source,destination,auxilary,ans);
        ArrayList<Integer> val = new ArrayList<>();
        val.add(N);
        val.add(source);
        val.add(destination);
        ans.add(val);
        tower(N-1,auxilary,source,destination,ans);
    }
    public static void main(String[] args) {
        int N = 2;
        System.out.println(towerOfHanoi(N));
        System.out.println("###########################################################");
        int number = 3;
        printTowerOfHanoi(number,'A','B','C');
    }
}
