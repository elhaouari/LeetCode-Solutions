package _83_Remove_Duplicates_from_Sorted_List;

import org.junit.jupiter.api.Test;
import utils.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testDeleteDuplicates(){

        ListNode list = new ListNode(1, 1, 2, 3, 3);
        ListNode expected = new ListNode(1, 2, 3);

        Solution s = new Solution();
        assertEquals(expected, s.deleteDuplicates(list));
    }
}