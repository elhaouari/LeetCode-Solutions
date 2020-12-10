package challenge570.week2.ValidMountainArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void validMountainArrayTest() {
        int[] arr = new int[]{2,1};

        Solution s = new Solution();
        assertFalse(s.validMountainArray(arr));
    }

    @Test
    public void validMountainArrayTestCase2() {
        int[] arr = new int[]{3,5,5};

        Solution s = new Solution();
        assertFalse(s.validMountainArray(arr));
    }

    @Test
    public void validMountainArrayTestCase3() {
        int[] arr = new int[]{0,3,2,1};

        Solution s = new Solution();
        assertTrue(s.validMountainArray(arr));
    }

    @Test
    public void validMountainArrayTestCase4() {
        int[] arr = new int[]{0,2,3,4,5,2,1,0};

        Solution s = new Solution();
        assertTrue(s.validMountainArray(arr));
    }
    @Test
    public void validMountainArrayTestCase5() {
        int[] arr = new int[]{0,2,3,3,5,2,1,0};

        Solution s = new Solution();
        assertFalse(s.validMountainArray(arr));
    }
    @Test
    public void validMountainArrayTestCase6() {
        int[] arr = new int[]{0,1,2,3,4,5,6,7,8,9};

        Solution s = new Solution();
        assertFalse(s.validMountainArray(arr));
    }

    @Test
    public void validMountainArrayTestCase7() {
        int[] arr = new int[]{9,8,7,6,5,4,3,2,1,0};

        Solution s = new Solution();
        assertFalse(s.validMountainArray(arr));
    }
}
