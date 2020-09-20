package _12_Integer_to_Roman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void intToRomanTestExample1(){
        Solution s = new Solution();

        assertEquals("III", s.intToRoman(3));
    }

    @Test
    public void intToRomanTestExample2(){
        Solution s = new Solution();

        assertEquals("IV", s.intToRoman(4));
    }

    @Test
    public void intToRomanTestExample3(){
        Solution s = new Solution();

        assertEquals("LVIII", s.intToRoman(58));
    }
}