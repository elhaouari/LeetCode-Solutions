package _2_add_two_numbers;

import org.junit.jupiter.api.Test;
import utils.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void addTwoNumbersTest(){

        ListNode l1 = new ListNode(2); // [2,4,3]
        l1.addNext(4).addNext(3);
        ListNode l2 = new ListNode(5);// [5,6,4]
        l2.addNext(6).addNext(4);

        Solution s = new Solution();
        ListNode actual = s.addTwoNumbers(l1, l2);

        var expected = new ListNode(7); // [7, 0, 8]
        expected.addNext(0).addNext(8);

        assertEquals(expected, actual);
    }
}