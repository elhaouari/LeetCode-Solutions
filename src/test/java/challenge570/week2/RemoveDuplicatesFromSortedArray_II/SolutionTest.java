package challenge570.week2.RemoveDuplicatesFromSortedArray_II;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void removeDuplicatesTest() {
        int[] arr = new int[]{1,1,1,2,2,3};

        Solution s = new Solution();
        assertEquals(5, s.removeDuplicates(arr));
    }

    @Test
    public void removeDuplicatesTest2() {
        int[] arr = new int[]{0,0,1,1,1,1,2,3,3};

        int[] expected = new int[]{0,0,1,1,2,3,3, 3, 3};

        Solution s = new Solution();
        assertEquals(7, s.removeDuplicates(arr));
        assertArrayEquals(expected, arr);
    }
}
