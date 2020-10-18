package _39_Combination_Sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testCombinationSum(){

        var input = new int[]{2,3,6,7};
        Solution s = new Solution();

        assertEquals("[[7], [2, 2, 3]]", s.combinationSum(input, 7).toString());
    }
}