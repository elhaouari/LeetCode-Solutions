package _220_ContainsDuplicate_III;

import java.util.TreeSet;

/**
 * https://leetcode.com/problems/contains-duplicate-iii/
 */
public class    Solution {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (t < 0) {
            return false;
        }

        TreeSet<Long> history = new TreeSet<>();
        int beginIndex = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (i - beginIndex > k) {
                history.remove((long) nums[beginIndex]);
                ++beginIndex;
            }

            if (!history.subSet((long) nums[i] - t, true, (long) nums[i] + t, true).isEmpty()) {
                return true;
            }

            history.add((long) nums[i]);
        }

        return false;
    }
}
