package _198_HouseRobber;

/**
 * Problem link: https://leetcode.com/problems/house-robber/
 */
public class Solution {

    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int[] totalToRob = new int[nums.length];
        totalToRob[0] = nums[0];
        totalToRob[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            totalToRob[i] = Math.max(totalToRob[i-1], nums[i] + totalToRob[i - 2]);
        }
        return totalToRob[nums.length - 1];
    }
}
