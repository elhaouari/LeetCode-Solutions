package challenges.januaryLeetcodingChallenge_2021.RemoveDuplicatesFromSortedList_II;

import utils.ListNode;

/**
 * https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/579/week-1-january-1st-january-7th/3593/
 */
public class Solution {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode tempHead = new ListNode();
        tempHead.next = head;

        ListNode p = tempHead;
        while (p.next != null && p.next.next != null) {
            if (p.next.val != p.next.next.val) {
                p = p.next;
            } else {
                int removedVal = p.next.val;
                while (p.next != null && p.next.val == removedVal) {
                    p.next = p.next.next;
                }
            }
        }

        return tempHead.next;
    }
}
