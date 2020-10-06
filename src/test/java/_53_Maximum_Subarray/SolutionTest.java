package _53_Maximum_Subarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testMaxSubArray(){
        Solution s = new Solution();
        var input = new int[]{-2,1,-3,4,-1,2,1,-5,4};

        assertEquals(6, s.maxSubArray(input));
    }
}