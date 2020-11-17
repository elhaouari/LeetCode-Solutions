package _147_InsertionSortList;

import utils.ListNode;

/**
 * Problem link: https://leetcode.com/problems/insertion-sort-list/
 */
public class Solution {

    public ListNode insertionSortList(ListNode head) {
        ListNode tempHead = new ListNode();

        while (head != null) {
            ListNode node = head;
            head = node.next;
            node.next = null;

            ListNode p = tempHead;
            while (p.next != null && p.next.val < node.val) {
                p = p.next;
            }
            node.next = p.next;
            p.next = node;
        }

        return tempHead.next;
    }
}
