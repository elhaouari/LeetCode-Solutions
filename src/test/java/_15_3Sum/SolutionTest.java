package _15_3Sum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testThreeSum(){

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(-1, -1, 2));
        expected.add(List.of(-1, 0, 1));

        Solution s = new Solution();
        List<List<Integer>> actual = s.threeSum(new int[]{-1,0,1,2,-1,-4});

        assertEquals(expected, actual);
    }
}