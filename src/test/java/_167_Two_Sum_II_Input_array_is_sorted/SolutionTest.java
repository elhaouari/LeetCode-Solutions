package _167_Two_Sum_II_Input_array_is_sorted;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testTowSum(){
        Solution s = new Solution();
        var input = new int[]{2,7,11,15};
        var target = 9;
        var expected = new int[]{1, 2};

        assertArrayEquals(expected, s.twoSum(input, target));
    }

    @Test
    public void testTowSumExample2(){
        Solution s = new Solution();
        var input = new int[]{-1, 0};
        var target = -1;
        var expected = new int[]{1, 2};

        assertArrayEquals(expected, s.twoSum(input, target));
    }
}