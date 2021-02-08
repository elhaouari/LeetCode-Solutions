package _203_RemoveLinkedListElements;

import utils.ListNode;

/**
 * https://leetcode.com/problems/remove-linked-list-elements/
 */
public class Solution {

    public ListNode removeElements(ListNode head, int val) {
        ListNode tempHead = new ListNode();
        tempHead.next = head;

        ListNode p = tempHead;
        while (p.next != null) {
            if (p.next.val == val) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }

        return tempHead.next;
    }
}
