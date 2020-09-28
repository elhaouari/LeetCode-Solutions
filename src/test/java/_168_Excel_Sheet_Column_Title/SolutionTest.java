package _168_Excel_Sheet_Column_Title;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testConvertToTitleEample1(){
        Solution s = new Solution();
        assertEquals("A", s.convertToTitle(1));
    }

    @Test
    public void testConvertToTitleEample2(){
        Solution s = new Solution();
        assertEquals("AB", s.convertToTitle(28));
    }

    @Test
    public void testConvertToTitleEample3(){
        Solution s = new Solution();
        assertEquals("ZY", s.convertToTitle(701));
    }
}