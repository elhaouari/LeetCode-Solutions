package _34_FindFirstAndLastPositionOfElementInSortedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testSearchRange(){
        var input = new int[]{5,7,7,8,8,10};
        Solution s = new Solution();

        assertArrayEquals(new int[]{3, 4},s.searchRange(input, 8));
    }
}