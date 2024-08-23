package com.scaler.advanced.dsa.advanceddsa2.module6.linkedlist;

/**
 * You are given A which is the head of a linked list.
 * Print the linked list in space separated manner.
 * Note : The last node value must also be succeeded by a space and after printing the entire list you should print a new line
 *
 *  Input : A = 1 -> 2 -> 3
 *  Output : 1 2 3
 *  Explanation : We print the given linked list
 *
 * Input : A = 4 -> 3 -> 2 -> 1
 * Output :4 3 2 1
 * Explanation: We print the given linked list
 *
 *
 * Example Output
 *
 *
 */


public class PrintLinkedList {

    public static void solve(ListNode A) {
        ListNode temp = A;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();

    }
    public static void main(String[] args) {

    }
}
