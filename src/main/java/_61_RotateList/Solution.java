package _61_RotateList;

import utils.ListNode;

/**
 * https://leetcode.com/problems/rotate-list/
 */
public class Solution {

    public ListNode rotateRight(ListNode head, int k) {
        int length = computeLength(head);
        if (length == 0 || k % length == 0) {
            return head;
        }
        k %= length;

        ListNode leftTail = head;
        for (int i = 0; i < length - k - 1; ++i) {
            leftTail = leftTail.next;
        }
        ListNode rightHead = leftTail.next;
        leftTail.next = null;
        ListNode rightTail = rightHead;
        while (rightTail.next != null) {
            rightTail = rightTail.next;
        }
        rightTail.next = head;

        return rightHead;
    }

    int computeLength(ListNode head) {
        int length = 0;
        while (head != null) {
            ++length;
            head = head.next;
        }

        return length;
    }
}
