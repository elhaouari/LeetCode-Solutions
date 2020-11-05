package _54_Spiral_Matrix;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void test(){
        int[][] input = new int[][]{
                {1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        Solution s = new Solution();
        var actual = s.spiralOrder(input);
        var expected = List.of(1,2,3,6,9,8,7,4,5);
        assertEquals(expected, actual);
    }
}