package challenges.challenge570.week3.SquaresOfSortedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void test(){

        var nums = new int[]{-4,-1,0,3,10};
        var expected = new int[]{0,1,9,16,100};

        Solution s = new Solution();
        var actual = s.sortedSquares(nums);
        assertArrayEquals(expected, actual);
    }
}
