package com.scaler.advanced.dsa.advanceddsa2.module6.linkedlist;

/**
 * You are given the head of a linked list A and an integer B. Delete the B-th node from the linked list.
 *
 * Note : Follow 0-based indexing for the node numbering.
 *
 * Input : A = 1 -> 2 -> 3       B = 1
 * Output: 1 -> 3
 *  Explanation:
 * The linked list after deletion is 1 -> 3.
 *
 * Input : A = 4 -> 3 -> 2 -> 1  B = 0
 * Output : 3 -> 2 -> 1
 * Explanation:
 *  * The linked list after deletion is 3 -> 2 -> 1.
 *
 *
 */
public class DeleteInLinkedList {
    public ListNode solve(ListNode A, int B) {
        ListNode head = A;
        int index = 0;
        ListNode prevNode=null;
        while(A!=null){
            if(index == B){
                if(index == 0){
                    head= A.next;
                    A.next=null;
                    return head;
                }
                prevNode.next = A.next;
                A.next =null;
                return head;
            }
            prevNode = A;
            A=A.next;
            index++;
        }
        return head;
    }
    public static void main(String[] args) {

    }
}
