package _4_Median_of_Two_Sorted_Arrays;

/**
 * Problem Link: https://leetcode.com/problems/median-of-two-sorted-arrays/
 */
public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double[] sorted = new double[nums1.length + nums2.length];

        int j = 0, k = 0;
        for (int i = 0; i < sorted.length; i ++) {
            if (k == nums2.length || j != nums1.length && nums1[j] < nums2[k]) {
                sorted[i] = nums1[j];
                j++;
            } else {
                sorted[i] = nums2[k];
                k++;
            }
        }
        if (sorted.length % 2 == 0) {
            return (sorted[sorted.length/2 - 1] + sorted[sorted.length/2]) / 2.0;
        }

        return sorted[sorted.length/2];
    }
}
