package com.scaler.advanced.dsa.advanceddsa2.module6.linkedlist;

/**
 *You are given a singly linked list having head node A. You have to reverse the linked list and return the head node of that reversed list.
 *
 * NOTE: You have to do it in-place and in one-pass.
 *
 * Input : A = 1 -> 2 -> 3 -> 4 -> 5 -> NULL
 * Output : 5 -> 4 -> 3 -> 2 -> 1 -> NULL
 * Explanation : The linked list has 5 nodes. After reversing them, the list becomes : 5 -> 4 -> 3 -> 2 -> 1 -> NULL
 *
 * Input : A = 3 -> NULL
 * Output : 3 -> NULL
 * Explanation : he linked list consists of only a single node. After reversing it, the list becomes : 3 -> NULL
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode A) {
        ListNode prev = null;
        ListNode curr = A;

        while(curr != null){

            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        return prev;
    }
    public static void main(String[] args) {

    }
}
