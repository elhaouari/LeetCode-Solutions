package challenges.januaryLeetcodingChallenge_2021.MaxNumberOfKSumPairs;

import java.util.*;
import java.util.stream.Stream;

/**
 * https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/581/week-3-january-15th-january-21st/3608/
 */
public class Solution {

    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> pairs = new HashMap<Integer, Integer>();
        int count = 0;
        for (int num : nums) {
            int pair = k - num;
            if (pairs.containsKey(pair)) {
                count += 1;
                if (pairs.get(pair) > 0) {
                    pairs.put(pair, pairs.get(pair) - 1);
                }
                if (pairs.get(pair) == 0) {
                    pairs.remove(pair);
                }
            } else {
                pairs.putIfAbsent(num, 0);
                pairs.put(num, pairs.get(num) + 1);
            }
        }
        return count;
    }
}
