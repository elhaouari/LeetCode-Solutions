package _171_ExcelSheetColumnNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void test(){
        Solution s = new Solution();
        assertEquals(1, s.titleToNumber("A"));
        assertEquals(26, s.titleToNumber("Z"));
        assertEquals(27, s.titleToNumber("AA"));
        assertEquals(28, s.titleToNumber("AB"));
    }
}