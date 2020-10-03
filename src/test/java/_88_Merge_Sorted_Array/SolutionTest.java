package _88_Merge_Sorted_Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testMerge(){
        Solution s = new Solution();

        var nums1 = new int[]{1,2,3,0,0,0};
        int m = 3;
        var nums2 = new int[]{2,5,6};
        int n = 3;
        s.merge(nums1, m, nums2, n);

        assertArrayEquals(new int[]{1,2,2,3,5,6}, nums1);
    }
}