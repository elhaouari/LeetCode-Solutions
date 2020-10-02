package _136_Single_Number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testSingleNumber(){
        var input = new int[]{2,2,1};
        Solution s = new Solution();
        assertEquals(1, s.singleNumber(input));
    }
}