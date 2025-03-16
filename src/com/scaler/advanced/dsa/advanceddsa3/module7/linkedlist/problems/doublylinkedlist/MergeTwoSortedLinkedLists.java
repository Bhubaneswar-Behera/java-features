package com.scaler.advanced.dsa.advanceddsa3.module7.linkedlist.problems.doublylinkedlist;


/**
 * Merge two sorted linked lists, A and B, and return it as a new list.
 *  The new list should be made by splicing together the nodes of
 *  the first two lists and should also be sorted.
 * Problem Constraints : 0 <= |A|, |B| <= 105
 *
 * Example :
 * Input : A = 5 -> 8 -> 20  B = 4 -> 11 -> 15
 * Output : 4 -> 5 -> 8 -> 11 -> 15 -> 20
 * Explanation :Merging A and B will result in 4 -> 5 -> 8 -> 11 -> 15 -> 20
 *
 * Input : A = 1 -> 2 -> 3   B = Null
 * Output : 1 -> 2 -> 3
 * Explanation : We don't need to merge as B is empty.
 */
public class MergeTwoSortedLinkedLists {
    public Node mergeTwoLists(Node L1, Node L2) {
        if (L1 == null) {
            return L2;
        }
        if (L2 == null) {
            return L1;
        }
       Node mergedLinkedList = null;
        //If L1's data is less than or equal to L2's data,
        // mergedLinkedList is set to L1, and L1 is moved to the next node.
        if (L1.data <= L2.data) {
            mergedLinkedList = L1;
            L1 = L1.next;
        } else { //Otherwise, mergedLinkedList is set to L2,
                // and L2 is moved to the next node.
            mergedLinkedList = L2;
            L2 = L2.next;
        }
        Node current = mergedLinkedList;
        while (L1 != null && L2 != null) {
            if (L1.data <= L2.data) {
                current.next = L1;
                L1 = L1.next;
            } else {
                current.next = L2;
                L2 = L2.next;
            }
            current = current.next;
        }
        if(L1 != null){
            current.next = L1;
        } else if (L2 != null) {
            current.next = L2;
        }
        return mergedLinkedList;
    }
    //main method to test the code
    public static void main(String[] args) {
        MergeTwoSortedLinkedLists obj = new MergeTwoSortedLinkedLists();
        Node head1 = new Node(5);
        head1.next = new Node(8);
        head1.next.next = new Node(20);

        Node head2 = new Node(4);
        head2.next = new Node(11);
        head2.next.next = new Node(15);

        Node mergedLinkedList = obj.mergeTwoLists(head1, head2);
        while (mergedLinkedList != null) {
            System.out.print(mergedLinkedList.data + " ");
            mergedLinkedList = mergedLinkedList.next;
        }
    }
}
