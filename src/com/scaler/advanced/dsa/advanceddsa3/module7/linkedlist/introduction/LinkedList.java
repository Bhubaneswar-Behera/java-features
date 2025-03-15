package com.scaler.advanced.dsa.advanceddsa3.module7.linkedlist.introduction;

public class LinkedList {
    // Function to print the linked list
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    //Function to check if the linked list contains value or not
    public boolean search(Node head, int x) {
        Node current = head;
        while (current != null) {
            if (current.data == x) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    //insert a new node with data v at index p in the linked list
    public Node insertAtPosition(int position, int data, Node head) {
        Node newNode = new Node(data);
        Node temp = head;
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return head;
        }

        for (int i = 1; i < position ; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }
}
