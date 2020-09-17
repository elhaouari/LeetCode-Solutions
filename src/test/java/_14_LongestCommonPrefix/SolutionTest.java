package _14_LongestCommonPrefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void longestCommonPrefixTest(){

        Solution s = new Solution();
        var actual = s.longestCommonPrefix(new String[]{"flower","flow","flight"});

        assertEquals("fl", actual);
    }
}