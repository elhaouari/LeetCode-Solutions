package _47_Permutations_II;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testPermuteUnique(){

        var input = new int[]{1, 1, 2};

        var expected = List.of(List.of(1, 1, 2),  List.of(1, 2, 1), List.of(2, 1, 1));

        Solution s = new Solution();
        var actual = s.permuteUnique(input);
        assertEquals(expected, actual);
    }
}