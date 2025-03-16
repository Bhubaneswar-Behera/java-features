package com.scaler.advanced.dsa.advanceddsa3.module7.linkedlist.sorting.and.detecting.loop;

public class FindMiddleOfLinkedList {
    //find middle of the linked list without fast and slow pointer
    public Node findMiddle(Node head){
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int mid = (count - 1) / 2;
        temp = head;
        for (int i = 0; i < mid; i++) {
            temp = temp.next;
        }
        return temp;
    }
    //using fast and slow pointer
    public Node findMiddleUsingFastAndSlowPointer(Node head){
        if (head == null) {
            return null;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //main method to test the code
    public static void main(String[] args) {
        FindMiddleOfLinkedList obj = new FindMiddleOfLinkedList();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        Node middle = obj.findMiddle(head);
        System.out.println(middle.data);

        Node middle1 = obj.findMiddleUsingFastAndSlowPointer(head);
        System.out.println(middle1.data);
    }
}
