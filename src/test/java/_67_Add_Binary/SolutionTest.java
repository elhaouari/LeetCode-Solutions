package _67_Add_Binary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testAddBinary(){
        Solution s = new Solution();
        assertEquals("100", s.addBinary("1", "11"));
    }

    @Test
    public void testAddBinaryExample2(){
        Solution s = new Solution();
        assertEquals("10101", s.addBinary("1010", "1011"));
    }
}