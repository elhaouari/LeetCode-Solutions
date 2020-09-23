package _66_Plus_One;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testPlusOneExample1(){
        Solution s = new Solution();

        assertArrayEquals(new int[]{1,2,4}, s.plusOne(new int[]{1,2,3}));
    }

    @Test
    public void testPlusOneExample2(){
        Solution s = new Solution();

        assertArrayEquals(new int[]{1,3,0}, s.plusOne(new int[]{1,2, 9}));
    }

}