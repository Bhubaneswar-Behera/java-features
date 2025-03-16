package com.scaler.advanced.dsa.advanceddsa3.module7.linkedlist.problems.doublylinkedlist;

/**
 * Sort a linked list, A in O(n log n) time.
 * Problem Constraints : 0 <= |A| = 105
 *
 * Input : A = [3, 4, 2, 8]
 * Output :[2, 3, 4, 8]
 * Explanation : The sorted form of [3, 4, 2, 8] is [2, 3, 4, 8].
 *
 * Input : A = [1]            Output : [1]
 * Explanation : The sorted form of [1] is [1].
 *
 */
public class SortListUsingMergeSort {
    //method to sort a Linked List using Merge Sort
    static class Node {
        int data;
        Node next, prev;
        Node(int data) {
            this.data = data;
            next = prev = null;
        }
    }

    public Node sortList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;

        middle.next = null;

        Node left = sortList(head);
        Node right = sortList(nextOfMiddle);

        return merge(left, right);
    }

    public Node getMiddle(Node head) {
        if (head == null) {
            return head;
        }

        Node slow = head, fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node merge(Node left, Node right) {
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }

        if (left.data <= right.data) {
            left.next = merge(left.next, right);
            left.next.prev = left;
            left.prev = null;
            return left;
        } else {
            right.next = merge(left, right.next);
            right.next.prev = right;
            right.prev = null;
            return right;
        }
    }
    //main method to test the code
    public static void main(String[] args) {
        SortListUsingMergeSort obj = new SortListUsingMergeSort();
        Node head = new Node(3);
        head.next = new Node(4);
        head.next.next = new Node(2);
        head.next.next.next = new Node(8);
        Node sortedList = obj.sortList(head);
        while (sortedList != null) {
            System.out.print(sortedList.data + " ");
            sortedList = sortedList.next;
        }
    }
}
