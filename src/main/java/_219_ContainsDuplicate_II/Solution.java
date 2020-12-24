package _219_ContainsDuplicate_II;

import java.util.HashSet;

/**
 * https://leetcode.com/problems/contains-duplicate-ii/
 */
public class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (!set.add(nums[i])) return true;
            if (i >= k) set.remove(nums[i - k]);
        }
        return false;
    }
}
