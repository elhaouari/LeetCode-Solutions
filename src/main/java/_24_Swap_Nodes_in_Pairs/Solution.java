package _24_Swap_Nodes_in_Pairs;

import utils.ListNode;

/**
 *  Problem link: https://leetcode.com/problems/swap-nodes-in-pairs/
 */
public class Solution {

    public ListNode swapPairs(ListNode head) {
        ListNode tempHead = new ListNode(0);
        tempHead.next = head;

        ListNode current = tempHead;
        while (current.next != null && current.next.next != null) {
            ListNode node1 = current.next;
            ListNode node2 = node1.next;
            ListNode after = node2.next;
            current.next = node2;
            node2.next = node1;
            node1.next = after;
            current = current.next.next;
        }

        return tempHead.next;
    }
}
