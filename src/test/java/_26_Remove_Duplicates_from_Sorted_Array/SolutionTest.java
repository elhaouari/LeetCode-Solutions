package _26_Remove_Duplicates_from_Sorted_Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void removeDuplicatesTest() {
        Solution s = new Solution();
        assertEquals(2, s.removeDuplicates(new int[]{1,1,2}));
    }
}