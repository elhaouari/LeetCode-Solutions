package _46_Permutations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void test(){

        var input = new int[]{1, 2, 3};
        Solution s = new Solution();

        var expected = "[[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]";
        assertEquals(expected, s.permute(input).toString());
    }
}