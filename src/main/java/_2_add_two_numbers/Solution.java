package _2_add_two_numbers;

import utils.ListNode;

import java.util.Objects;

/**
 * Problem Link: https://leetcode.com/problems/add-two-numbers
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode root = new ListNode(0);
        ListNode c = root;
        int carry = 0;
        while(l1 != null || l2 != null) {
            if (l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }
            c.val = carry%10;
            carry = carry/10;



            if (l1 != null || l2 != null) {
                c.next = new ListNode(0);
                c = c.next;
            }
        }
        if (carry != 0) {
            c.next = new ListNode(carry);
        }
        return root;
    }
}
