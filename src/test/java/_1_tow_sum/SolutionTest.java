package _1_tow_sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void towSumTest(){
        int[] input = new int[]{2,7,11,15};
        int target = 9;

        Solution s = new Solution();
        int[] actual = s.twoSum(input, target);

        assertArrayEquals(new int[]{0, 1}, actual);
    }
}