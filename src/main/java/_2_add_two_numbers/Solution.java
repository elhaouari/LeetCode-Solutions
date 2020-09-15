package _2_add_two_numbers;

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

class ListNode{
    ListNode next;
    int val;

    public ListNode(int carry) {
        this.val = carry;
    }

    public ListNode addNext(int n){
        if (next == null) {
            next = new ListNode(n);
        } else {
            next.addNext(n);
        }
        return next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val &&
                Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(next, val);
    }
}