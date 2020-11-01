package _33_Search_in_Rotated_Sorted_Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testSearch(){
        Solution s = new Solution();
        var actual = s.search(new int[]{4,5,6,7,0,1,2}, 0);
        assertEquals(4, actual);
    }
}