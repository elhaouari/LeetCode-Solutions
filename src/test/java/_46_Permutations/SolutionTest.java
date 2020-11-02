package _46_Permutations;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void test(){

        var input = new int[]{1, 2, 3};
        Solution s = new Solution();

        var expected = List.of(
                List.of(1, 2, 3), List.of(1, 3, 2), List.of(2, 1, 3),
                List.of(2, 3, 1), List.of(3, 1, 2), List.of(3, 2, 1)
        );
        assertEquals(expected, s.permute(input));
    }
}