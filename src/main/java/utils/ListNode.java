package utils;

import java.util.Arrays;
import java.util.Objects;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int...nums) {
        if (nums.length > 0) {
            this.val = nums[0];
            addBulc(Arrays.copyOfRange(nums, 1, nums.length));
        }
    }

    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

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
        return "{" + val + ", " + next + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(next, val);
    }
}
