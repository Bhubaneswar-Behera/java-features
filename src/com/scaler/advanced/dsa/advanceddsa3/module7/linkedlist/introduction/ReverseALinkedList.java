package com.scaler.advanced.dsa.advanceddsa3.module7.linkedlist.introduction;

public class ReverseALinkedList {
    public Node reverseLinkedList(Node head) {
        if(head == null || head.next == null) {
            return head;

        }
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
    //main method to test the above function
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        linkedList.printList(head);
        System.out.println();
        ReverseALinkedList reverseALinkedList = new ReverseALinkedList();
        head = reverseALinkedList.reverseLinkedList(head);
        linkedList.printList(head);
    }
}
