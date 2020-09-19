package _13_Roman_to_Integer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void romanToIntExample1(){
        Solution s = new Solution();
        assertEquals(3, s.romanToInt("III"));
    }

    @Test
    public void romanToIntExample2(){
        Solution s = new Solution();
        assertEquals(4, s.romanToInt("IV"));
    }

    @Test
    public void romanToIntExample3(){
        Solution s = new Solution();
        assertEquals(9, s.romanToInt("IX"));
    }

    @Test
    public void romanToIntExample4(){
        Solution s = new Solution();
        assertEquals(58, s.romanToInt("LVIII"));
    }

    @Test
    public void romanToIntExample5(){
        Solution s = new Solution();
        assertEquals(1994, s.romanToInt("MCMXCIV"));
    }
}