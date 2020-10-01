package _83_Remove_Duplicates_from_Sorted_List;

import utils.ListNode;

/**
 * Problem link: https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 */
public class Solution {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
