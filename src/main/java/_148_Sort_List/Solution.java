package _148_Sort_List;

import utils.ListNode;

import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/sort-list/submissions/
 */
public class Solution {

    public ListNode sortList(ListNode head) {

        if(head==null)
            return head;

        PriorityQueue<ListNode> pq = new PriorityQueue<>((o1, o2)->o1.val-o2.val);

        ListNode temp = head;
        while(temp!=null){
            pq.add(temp);
            temp = temp.next;
        }

        ListNode newHead = pq.remove();
        temp = newHead;

        while(!pq.isEmpty()){
            temp.next = pq.remove();
            temp = temp.next;
            temp.next = null;
        }
        return newHead;
    }
}
