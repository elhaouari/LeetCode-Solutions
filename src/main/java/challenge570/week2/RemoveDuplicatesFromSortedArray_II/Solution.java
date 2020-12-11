package challenge570.week2.RemoveDuplicatesFromSortedArray_II;

/**
 * https://leetcode.com/explore/challenge/card/december-leetcoding-challenge/570/week-2-december-8th-december-14th/3562/
 */
public class Solution {

    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) return nums.length;

        int length = 2;
        for (int i = 2; i < nums.length; ++i) {
            if (nums[i] != nums[length - 2]) {
                nums[length] = nums[i];
                ++length;
            }
        }

        return length;
    }
}
