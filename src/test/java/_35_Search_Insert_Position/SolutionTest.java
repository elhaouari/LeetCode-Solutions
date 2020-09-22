package _35_Search_Insert_Position;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testSearchInsertExample1(){

        Solution s = new Solution();
        var actual = s.searchInsert(new int[]{1,3,5,6}, 5);

        assertEquals(2, actual);
    }

    @Test
    public void testSearchInsertExample2(){

        Solution s = new Solution();
        var actual = s.searchInsert(new int[]{1,3,5,6}, 2);

        assertEquals(1, actual);
    }

    @Test
    public void testSearchInsertExample3(){

        Solution s = new Solution();
        var actual = s.searchInsert(new int[]{1,3,5,6}, 7);

        assertEquals(4, actual);
    }

    @Test
    public void testSearchInsertExample4(){

        Solution s = new Solution();
        var actual = s.searchInsert(new int[]{1,3,5,6}, 0);

        assertEquals(0, actual);
    }
}