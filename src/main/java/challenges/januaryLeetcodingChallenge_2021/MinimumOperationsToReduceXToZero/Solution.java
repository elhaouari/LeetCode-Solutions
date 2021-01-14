package challenges.januaryLeetcodingChallenge_2021.MinimumOperationsToReduceXToZero;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/580/week-2-january-8th-january-14th/3603/
 */
public class Solution {

    public int minOperations(int[] nums, int x) {
        Map<Integer, Integer> rightSumToLength = new HashMap<>();
        rightSumToLength.put(0, 0);
        int rightSum = 0;
        for (int i = nums.length - 1; i >= 0; --i) {
            rightSum += nums[i];
            rightSumToLength.put(rightSum, nums.length - i);
        }

        int result = rightSumToLength.getOrDefault(x, Integer.MAX_VALUE);
        int leftSum = 0;
        for (int i = 0; i < nums.length; ++i) {
            leftSum += nums[i];
            if (rightSumToLength.containsKey(x - leftSum)) {
                result = Math.min(result, i + 1 + rightSumToLength.get(x - leftSum));
            }
        }

        return (result > nums.length) ? -1 : result;
    }
}
