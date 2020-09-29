package _28_Implement_strStr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testStrStr(){
        Solution s = new Solution();
        assertEquals(2, s.strStr("hello", "ll"));
    }
}