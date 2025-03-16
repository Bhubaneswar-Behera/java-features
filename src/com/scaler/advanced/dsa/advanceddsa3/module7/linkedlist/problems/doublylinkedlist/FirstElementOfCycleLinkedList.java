package com.scaler.advanced.dsa.advanceddsa3.module7.linkedlist.problems.doublylinkedlist;

public class FirstElementOfCycleLinkedList {
    //method to give the starting point of the cycle in the linked list
    public Node detectCycle(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node slow = head;
        Node fast = head;
        boolean isCycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                isCycle = true;
                break;
            }
        }
        if (!isCycle) {
            return null;
        }
        //Resets the slow pointer to the head of the linked list.
        //and fast pointer at the point of intersection
        //The while loop continues until slow and fast pointers meet.
        //Inside the loop, both slow and fast pointers
        //move one step at a time (slow = slow.next; and fast = fast.next;).
        //When slow and fast pointers meet, it indicates the start of the cycle.
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    //main method to test the code
    public static void main(String[] args) {
        FirstElementOfCycleLinkedList obj = new FirstElementOfCycleLinkedList();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head.next;
        Node cycleStart = obj.detectCycle(head);
        System.out.println(cycleStart.data);
    }
}
