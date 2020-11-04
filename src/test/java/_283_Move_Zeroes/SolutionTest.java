package _283_Move_Zeroes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void test(){
        Solution s  = new Solution();
        var input = new int[]{0,1,0,3,12};
        s.moveZeroes(input);
        var expected = new int[]{1,3,12,0,0};
        assertArrayEquals(expected, input);
    }
}