package _16_3Sum_Closest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testThreeSumClosest(){
        var input = new int[]{-1,2,1,-4};

        Solution s = new Solution();
        var actual = s.threeSumClosest(input, 1);

        assertEquals(2, actual);
    }
}