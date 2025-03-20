package com.scaler.advanced.dsa.advanceddsa3.module7.linkedlist.problems.and.doublylinkedlist;

public class DoublyLinkedList {
    //method to insert a new node just before the tail node of the doubly linked list
    //Given Doubly linked list has greater than 2 node
    //use Tail node to insert the new node
    public Node insertBeforeTail(Node head, Node tail,Node newNode) {

        Node prev = tail.prev;
        prev.next = newNode;
        newNode.next = tail;
        tail.prev = newNode;

        return head;
    }
    //delete a node from the doubly linked list
    //where node reference is given
    //given node is not the head or tail node
    //Doubly linked list has more than 2 nodes
    public Node deleteNode(Node x) {
       Node prev = x.prev;
       Node nxt = x.next;
       prev.next = nxt;
       nxt.prev = prev;
        return x;
    }
}
