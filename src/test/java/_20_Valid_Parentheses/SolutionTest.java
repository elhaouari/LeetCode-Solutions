package _20_Valid_Parentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void isValidTestExample1(){
        Solution s = new Solution();
        assertTrue(s.isValid("()[]{}"));
    }

    @Test
    public void isValidTestExample2(){
        Solution s = new Solution();
        assertTrue(s.isValid("({})"));
    }

    @Test
    public void isValidTestFalse(){
        Solution s = new Solution();
        assertFalse(s.isValid("({)}"));
    }
}