package _141_Linked_List_Cycle;

import org.junit.jupiter.api.Test;
import utils.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void test(){

        ListNode node = new ListNode(3, 2, 0);
        ListNode last = new ListNode(-4);
        last.next = node.next;
        node.addNext(last);

        Solution s = new Solution();
        assertTrue(s.hasCycle(node));

    }
}