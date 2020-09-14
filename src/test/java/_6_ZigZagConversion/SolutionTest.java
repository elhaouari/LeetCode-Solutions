package _6_ZigZagConversion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void convertTest(){
        Solution s = new Solution();
        var actual = s.convert("PAYPALISHIRING", 3);

        assertEquals("PAHNAPLSIIGYIR", actual);
    }
}