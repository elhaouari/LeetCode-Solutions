package _328_OddEvenLinkedList;

import utils.ListNode;

/**
 * https://leetcode.com/problems/odd-even-linked-list/
 */
public class Solution {

    public ListNode oddEvenList(ListNode head) {
        ListNode tempHead = new ListNode(0);
        tempHead.next = head;

        ListNode evenHead = new ListNode(0);
        evenHead.next = null;
        ListNode evenTail = evenHead;

        ListNode node = tempHead;
        boolean oddOrEven = true;
        while (node.next != null) {
            if (oddOrEven) {
                node = node.next;
            } else {
                evenTail.next = node.next;
                node.next = node.next.next;
                evenTail.next.next = null;
                evenTail = evenTail.next;
            }

            oddOrEven = !oddOrEven;
        }

        node.next = evenHead.next;

        return tempHead.next;
    }
}
