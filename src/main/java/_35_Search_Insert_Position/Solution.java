package _35_Search_Insert_Position;

/**
 * Problem link: https://leetcode.com/problems/search-insert-position
 */
public class Solution {

    public int searchInsert(int[] nums, int target) {
        int r = 0, l = nums.length, m = 0;

        if (nums[l-1] < target) return l;
        if (nums[0] > target) return 0;

        while (l >= r) {
            m = (l+r)/2;
            if (nums[m] == target) return m;
            if (nums[m] > target)
                l = m - 1;
            else
                r = m + 1;
        }

        if (nums[m] > target)
            return m;
        return ++m;
    }
}
