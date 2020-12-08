package _152_MaximumProductSubarray;

/**
 * Problem link: https://leetcode.com/problems/maximum-product-subarray/
 */
public class Solution {

    public int maxProduct(int[] nums) {
        int max = nums[0];
        int current = nums[0];

        for(int i = 1; i<nums.length; i++){
            current = current * nums[i] != 0 ? current * nums[i] : nums[i];
            max = Math.max(current, max);
        }

        current = nums[nums.length-1];
        max = Math.max(current, max);
        if(current == max && current > 0) return max;

        for(int i = nums.length-2; i>=0; i--){
            current = current * nums[i] != 0 ? current * nums[i] : nums[i];
            max = Math.max(current, max);
        }

        return max;
    }

}
