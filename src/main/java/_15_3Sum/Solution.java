package _15_3Sum;

import java.util.*;

/**
 * Problem link: https://leetcode.com/problems/3sum/
 */
public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        HashSet<List<Integer>> set=new HashSet<>();

        if(nums.length<3)
            return res;

        Arrays.sort(nums);

        int left, right;
        for(int i = 0; i<nums.length-2; i++) {
            left = i + 1;
            right = nums.length-1;
            while(left < right)
            {
                if(nums[i] + nums[left] + nums[right] < 0)
                    left++;
                else if(nums[i] + nums[left] + nums[right] > 0)
                    right--;
                else {
                    set.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                }
            }
        }

        res.addAll(set);

        return res;
    }

}
