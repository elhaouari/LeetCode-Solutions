package _16_3Sum_Closest;

import java.util.Arrays;

/**
 * Problem link: https://leetcode.com/problems/3sum-closest/
 */
public class Solution {

    public int threeSumClosest(int[] nums, int target) {
        int diff = Integer.MAX_VALUE, ans = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1, r = nums.length - 1;
            while( l < r){
                int res = nums[l] + nums[r] + nums[i] - target;
                if(diff > Math.abs(res)){
                    ans = res + target;
                    diff = Math.min(Math.abs(res), diff);
                }
                if(res > 0) r--;
                else if(res < 0) l++;
                else return target;
            }
        }
        return ans;
    }
}
