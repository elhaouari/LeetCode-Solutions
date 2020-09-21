package _21_Merge_Two_Sorted_Lists;

import utils.ListNode;

import java.util.Objects;

class Solution {

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
