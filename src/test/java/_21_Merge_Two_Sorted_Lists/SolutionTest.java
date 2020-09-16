package _21_Merge_Two_Sorted_Lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void mergeTwoListsTest(){

        ListNode l1 = new ListNode(1); // [1,2,4, 5]
        l1.addBulc(2, 4, 5);
        ListNode l2 = new ListNode(1); // [1,3,4]
        l2.addBulc(3, 4);

        ListNode expacted = new ListNode(1); // [1, 1, 2, 3, 4, 4, 5]
        expacted.addBulc(1, 2, 3, 4, 4, 5);

        Solution s = new Solution();

        ListNode actual = s.mergeTwoLists(l1, l2);

        assertEquals(expacted, actual);
    }
}