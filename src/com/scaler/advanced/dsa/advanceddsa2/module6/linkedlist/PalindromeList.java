package com.scaler.advanced.dsa.advanceddsa2.module6.linkedlist;

/**
 * Given a singly linked list A, determine if it's a palindrome. Return 1 or 0, denoting if it's a palindrome or not, respectively.
 *
 * Input : A = [1, 2, 2, 1] Output : 1
 * Explanation : The first linked list is a palindrome as [1, 2, 2, 1] is equal to its reversed form.
 *
 * Input : A = [1, 3, 2] Output : 0
 * Explanation : The second linked list is not a palindrome as [1, 3, 2] is not equal to [2, 3, 1].
 */
public class PalindromeList {

    public int lPalin(ListNode A) {
        ListNode middle = getMiddle(A);
        ListNode f = A;
        ListNode s = middle.next;
        middle.next = null; // cut first and second halves
        s = reverse(s); // reverse 2nd half

        // compare two halves
        while(s != null && f.val == s.val) {
            f = f.next;
            s = s.next;
        }

        if(s != null)
            return 0;

        return 1;
    }
    public ListNode getMiddle(ListNode node) {
        ListNode slow = node;
        ListNode fast = node;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode node) {
        ListNode prev = null;
        ListNode curr = node;
        ListNode next = node;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void main(String[] args) {

    }
}
