package _92_ReverseLinkedList_II;

import utils.ListNode;

import java.util.LinkedList;
import java.util.Stack;

/**
 * https://leetcode.com/problems/reverse-linked-list-ii/
 */
class Solution {

    public ListNode reverseBetween(ListNode head, int m, int n) {

        Stack<ListNode> stack = new Stack();
        ListNode curr = head;
        ListNode start = curr, preStart = curr , end = curr, endNext = curr;
        int index = 1;
        if(curr.next == null || m == n)
            return head;

        boolean firstNodeFound = false;
        while(curr != null) {
            if(index == m){
                firstNodeFound = true;
                start = curr;
            }
            else if(index == n){
                end = curr;
                endNext = end.next;
                stack.push(curr);
                break;
            }
            if(firstNodeFound)
                stack.push(curr);
            if(!firstNodeFound)
                preStart = curr;
            index++;
            curr = curr.next;
        }

        if(start != head)
            curr = preStart;
        else {
            head = stack.pop();
            curr = head;
        }
        while(!stack.isEmpty()){
            curr.next = stack.pop();
            curr = curr.next;
        }
        curr.next = endNext;
        return head;
    }
}
