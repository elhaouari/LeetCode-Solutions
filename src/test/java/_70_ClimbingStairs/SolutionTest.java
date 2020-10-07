package _70_ClimbingStairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testClimbStairs(){
        Solution s = new Solution();
        assertEquals(3, s.climbStairs(3));
    }
}