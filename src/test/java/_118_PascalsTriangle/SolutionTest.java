package _118_PascalsTriangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testGenerate(){
        Solution s = new Solution();
        String expected = "[[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]";
        String actual = s.generate(5).toString().replace(" ", "");
        assertEquals(expected, actual);
    }

    @Test
    public void testGenerateValue10(){
        Solution s = new Solution();
        String expected = "[[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1],[1,5,10,10,5,1],[1,6,15,20,15,6,1],[1,7,21,35,35,21,7,1],[1,8,28,56,70,56,28,8,1],[1,9,36,84,126,126,84,36,9,1]]";
        String actual = s.generate(10).toString().replace(" ", "");
        assertEquals(expected, actual);
    }
}