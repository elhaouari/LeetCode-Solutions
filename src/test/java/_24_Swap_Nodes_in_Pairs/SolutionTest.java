package _24_Swap_Nodes_in_Pairs;

import org.junit.jupiter.api.Test;
import utils.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testSwapPairsExample1() {
        ListNode l = new ListNode(1, 2, 3, 4); //[1,2,3,4]
        ListNode expected = new ListNode(2, 1, 4, 3);

        System.out.println(l);
        Solution s = new Solution();
        assertEquals(expected, s.swapPairs(l));

    }
}