package com.scaler.advanced.dsa.advanceddsa3.module7.linkedlist.introduction;

public class CheckPalindrome {
    //this function will return true if the
    // linked list is palindrome else false
    //using first and slow pointer approach
    public boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node secondHalf = slow.next;
        slow.next = null;
        secondHalf = reverseLinkedList(secondHalf);
        Node firstHalf = head;
        while (firstHalf != null && secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }
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
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        linkedList.printList(head);
        System.out.println();
        CheckPalindrome checkPalindrome = new CheckPalindrome();
        System.out.println(checkPalindrome.isPalindrome(head));
    }
}
