package _8_String_to_Integer_atoi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void myAtoiTestExample1() {
        Solution s = new Solution();
        assertEquals(42, s.myAtoi("42"));
    }

    @Test
    public void myAtoiTestExample2() {
        Solution s = new Solution();
        assertEquals(4193, s.myAtoi("4193 with words"));
    }
}