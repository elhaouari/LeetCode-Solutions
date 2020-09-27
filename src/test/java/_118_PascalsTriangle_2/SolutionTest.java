package _118_PascalsTriangle_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testGetRow(){
        Solution s = new Solution();
        assertEquals("[1,3,3,1]", s.getRow(3).toString().replace(" ", ""));
    }
}