package _40_Combination_Sum_II;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void test(){
        Solution s = new Solution();
        var actual = s.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8);

        var expected = List.of(
                List.of(1,1,6), List.of(1, 2, 5),
                List.of(1, 7), List.of(2, 6)
        );

       assertTrue(expected.containsAll(actual));
       assertTrue(actual.containsAll(expected));
    }
}