package _19_RemoveNthNodeFromEndOfList;

import utils.ListNode;

/**
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */
public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode front = head;
        for (int i = 0; i < n; i++) {
            front = front.next;
        }

        if (front == null) {
            return head.next;
        }

        ListNode back = head;
        while (front.next != null) {
            front = front.next;
            back = back.next;
        }
        back.next = back.next.next;
        return head;
    }
}
