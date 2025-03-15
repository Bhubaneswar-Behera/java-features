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
    public Node insertAtIndex(int index, int data, Node head) {
        Node newNode = new Node(data);
        Node temp = head;
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return head;
        }

        for (int i = 1; i < index ; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }
    //delete the first occurrence of the value x in the linked list
    //id value is not present then return the linked list as it is
    public Node deleteNode( int x, Node head) {
        if (head == null) {
            return null;
        }
        if (head.data == x) {
            head = head.next;
            return head;
        }
        Node tempNode = head;
        while (tempNode.next != null) {
            if (tempNode.next.data == x) {
                tempNode.next = tempNode.next.next;
                break;
            }
            tempNode = tempNode.next;
        }
        return head;
    }
    //Delete all elements with value x from the linked list
    public Node deleteAllOccurances(Node head, int x) {
       if(head == null){
           return head;
       }
       if(head.data == x){
           head = head.next;
       }
        Node temp = head;
        while (temp != null && temp.next != null) {
            if (temp.next.data == x) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }
}
