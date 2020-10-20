package _48_Rotate_Image;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testRotate(){
        var input = new int[][]{{1,2,3},
                                {4,5,6},
                                {7,8,9}};

        var expected = new int[][]{{7,4,1},
                                   {8,5,2},
                                   {9,6,3}};

        Solution s = new Solution();
        s.rotate(input);

        assertArrayEquals(expected, input);
    }
}