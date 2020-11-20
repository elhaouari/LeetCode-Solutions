package _143_ReorderList;

import utils.ListNode;

/**
 * Problem link: https://leetcode.com/problems/reorder-list/
 */
public class Solution {

    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }

        int length = findLength(head);

        ListNode node = head;
        for (int i = 0; i < (length - 1) / 2; ++i) {
            node = node.next;
        }
        ListNode backHead = node.next;
        node.next = null;
        backHead = reverse(backHead);

        ListNode p = head;
        while (backHead != null) {
            ListNode q = backHead;
            backHead = backHead.next;
            q.next = p.next;
            p.next = q;
            p = q.next;
        }
    }

    private int findLength(ListNode head) {
        int length = 0;
        for (ListNode node = head; node != null; node = node.next) {
            ++length;
        }

        return length;
    }

    private ListNode reverse(ListNode head) {
        ListNode tempHead = new ListNode();
        while (head != null) {
            ListNode node = head;
            head = head.next;
            node.next = tempHead.next;
            tempHead.next = node;
        }

        return tempHead.next;
    }
}
