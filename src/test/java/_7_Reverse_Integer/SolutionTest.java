package _7_Reverse_Integer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void reverseTest(){
        Solution s = new Solution();
        var actual = s.reverse(123);
        assertEquals(321, actual);
    }

    @Test
    public void reverseTestMaxValue(){
        Solution s = new Solution();
        var actual = s.reverse(1534236469);
        assertEquals(0, actual);
    }
}