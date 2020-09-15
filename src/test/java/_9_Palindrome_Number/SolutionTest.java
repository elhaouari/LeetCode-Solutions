package _9_Palindrome_Number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void isPalindromeTest(){
        Solution s = new Solution();
        assertTrue(s.isPalindrome(121));
    }

    @Test
    public void isPalindromeTestNegativeValue(){
        Solution s = new Solution();
        assertFalse(s.isPalindrome(-121));
    }
}