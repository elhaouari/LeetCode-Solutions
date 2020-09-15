package _1_tow_sum;

import java.util.HashMap;

/**
 * Problem Link: https://leetcode.com/problems/two-sum
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> pairs = new HashMap<Integer, Integer>();
        int x = 0;
        int y = 0;
        pairs.put(target - nums[0], 0);//3, 6
        for (int i = 1; i < nums.length; i++) {
            Object pair = pairs.get(nums[i]);
            if (pair != null) {
                y = i;
                x = (Integer)pair;
                break;
            }
            pairs.put(target - nums[i], i);
        }

        return new int[]{x,y};
    }
}