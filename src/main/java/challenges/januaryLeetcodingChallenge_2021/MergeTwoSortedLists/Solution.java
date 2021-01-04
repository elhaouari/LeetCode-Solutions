package challenges.januaryLeetcodingChallenge_2021.MergeTwoSortedLists;

import utils.ListNode;

/**
 * https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/579/week-1-january-1st-january-7th/3592/
 */
public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode sortedList = new ListNode();
        ListNode tmpList = sortedList;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tmpList.next = l1;
                l1 = l1.next;
            } else {
                tmpList.next = l2;
                l2 = l2.next;
            }
            tmpList = tmpList.next;
        }

        if (l1 != null) {
            tmpList.next = l1;
        }
        if (l2 != null) {
            tmpList.next = l2;
        }

        return sortedList.next;
    }
}
