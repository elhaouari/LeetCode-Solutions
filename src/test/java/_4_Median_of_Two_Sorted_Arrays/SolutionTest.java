package _4_Median_of_Two_Sorted_Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void findMedianSortedArraysExample1(){
        int[] nums1 = new int[]{2};
        int[] nums2 = new int[]{1,3};

        Solution s = new Solution();
        assertEquals(2, s.findMedianSortedArrays(nums1, nums2));
    }

    @Test
    public void findMedianSortedArraysExample2() {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};

        Solution s = new Solution();
        assertEquals(2.5, s.findMedianSortedArrays(nums1, nums2));
    }

    @Test
    public void findMedianSortedArraysExample3() {
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};

        Solution s = new Solution();
        assertEquals(0.5, s.findMedianSortedArrays(nums1, nums2));
    }
}