package _53_Maximum_Subarray;

/**
 * Problem link: https://leetcode.com/problems/maximum-subarray/
 */
public class Solution {

    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = sum;
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(sum + nums[i], nums[i]);
            max = Math.max(sum, max);
        }
        return max;
    }
}
