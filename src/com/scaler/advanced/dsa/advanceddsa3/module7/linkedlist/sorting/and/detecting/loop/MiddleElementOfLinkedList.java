package com.scaler.advanced.dsa.advanceddsa3.module7.linkedlist.sorting.and.detecting.loop;


/**
 * Given a linked list of integers, find and return the
 * middle element of the linked list.
 * NOTE: If there are N nodes in the linked list and N is
 * even then return the (N/2 + 1)th element.
 * Problem Constraints :
 * 1 <= length of the linked list <= 100000
 * 1 <= Node value <= 109
 *
 * Example :
 * Input : 1 -> 2 -> 3 -> 4 -> 5       Output : 3
 * Explanation : The middle element is 3.
 *
 * Input : 1 -> 5 -> 6 -> 2 -> 3 -> 4  Output : 2
 * Explanation : The middle element in even length linked list
 * of length N is ((N/2) + 1)th element which is 2.
 */
public class MiddleElementOfLinkedList {

    public int solve(Node A) {
        if (A == null) {
            return -1;  // Empty list case (though not required per constraints)
        }

        Node slow = A;
        Node fast = A;

        // Traverse the list with slow and fast pointers
        while (fast != null && fast.next != null) {
            slow = slow.next;       // Move slow pointer 1 step
            fast = fast.next.next;  // Move fast pointer 2 steps
        }

        // Slow pointer will now be at the middle
        return slow.data;
    }
    public static void main(String[] args) {

    }
}
