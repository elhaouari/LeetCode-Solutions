package _139_WordBreak;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testWordBreakE1(){
        Solution s = new Solution();
        assertTrue(s.wordBreak("leetcode", List.of("leet", "code")));
    }

    @Test
    public void testWordBreakE2(){
        Solution s = new Solution();
        assertTrue(s.wordBreak("aaaaaaa", List.of("aaaa","aaa")));
    }
}