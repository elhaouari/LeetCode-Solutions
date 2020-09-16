package _11_Container_With_Most_Water;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void maxAreaTest(){
        Solution s = new Solution();

        int actual = s.maxArea(new int[]{1,8, 2, 2, 3, 5});

        assertEquals(20, actual);
    }
}