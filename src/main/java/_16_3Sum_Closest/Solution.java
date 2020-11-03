package _16_3Sum_Closest;

import java.util.Arrays;

/**
 * Problem link: https://leetcode.com/problems/3sum-closest/
 */
public class Solution {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        Integer closest = null;
        for (int i = 0; i < nums.length; i++) {
            int remain = target - nums[i];
            for (int j = i + 1, k = nums.length - 1; j < k;) {
                int sum = nums[i] + nums[j] + nums[k];
                if (closest == null
                        || Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }
                if (nums[j] + nums[k] <= remain) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return closest;
    }
}
