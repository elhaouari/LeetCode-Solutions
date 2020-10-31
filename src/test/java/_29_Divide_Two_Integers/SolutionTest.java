package _29_Divide_Two_Integers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testDivide(){
        Solution s = new Solution();
        assertEquals(3, s.divide(10, 3));
    }

    @Test
    public void testDivideNegative(){
        Solution s = new Solution();
        assertEquals(-2, s.divide(7, -3));
    }
}