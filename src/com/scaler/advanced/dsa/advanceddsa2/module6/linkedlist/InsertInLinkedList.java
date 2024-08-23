package com.scaler.advanced.dsa.advanceddsa2.module6.linkedlist;

/**
 * You are given A which is the head of a linked list. Also given is the value B and position C. Complete the function that should insert a new node with the said value at the given position.
 *
 * Notes: In case the position is more than length of linked list, simply insert the new node at the tail only.
 * In case the pos is 0, simply insert the new node at head only.
 * Follow 0-based indexing for the node numbering.
 *
 *
 * Input : A = 1 -> 2 B = 3 C = 0
 * Output : 3 -> 1 -> 2
 * Input : A = 1 -> 2 B = 3 C = 1
 * Output : 1 -> 3 -> 2
 *
 *
 * Example Output
 *
 *
 *
 */
public class InsertInLinkedList {
    public ListNode solve(ListNode A, int B, int C) {
        ListNode newNode = new ListNode(B);
        if(C == 0 || A == null){
            newNode.next = A;
            A = newNode;
            return A;
        }

        ListNode temp = A;
        for(int i = 1; i <= C-1; i++){
            if(temp.next == null){
                break;
            }
            temp = temp.next;
        }

        //insert node
        newNode.next = temp.next;
        temp.next = newNode;
        return A;
    }
    public static void main(String[] args) {

    }
}
