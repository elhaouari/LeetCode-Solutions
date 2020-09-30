package _57_Insert_Interval;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testInsert(){

        var intervals = new int[][]{{1,3},{6,9}};
        var newInterval = new int[]{2,5};
        var expected = new int[][]{{1,5},{6,9}};

        Solution s = new Solution();
        assertArrayEquals(expected, s.insert(intervals, newInterval));
    }
}