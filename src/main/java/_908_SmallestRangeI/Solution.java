package _908_SmallestRangeI;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/smallest-range-i/
 */
public class Solution {

    public int smallestRangeI(int[] A, int K) {
        return Math.max(0, Arrays.stream(A).max().getAsInt() - Arrays.stream(A).min().getAsInt() - K * 2);
    }
}
