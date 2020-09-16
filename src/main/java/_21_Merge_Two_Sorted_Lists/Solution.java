package _21_Merge_Two_Sorted_Lists;

import java.util.Objects;

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public ListNode addNext(int n){
        if (next == null) {
            next = new ListNode(n);
        } else {
            next.addNext(n);
        }
        return next;
    }

    public void addBulc(int...n) {
        var node = this;
        for(int i : n) {
            node = node.addNext(i);
        }
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
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(next, val);
    }
}

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
