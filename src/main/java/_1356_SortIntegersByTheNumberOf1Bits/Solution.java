package _1356_SortIntegersByTheNumberOf1Bits;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/
 */
public class Solution {

    public int[] sortByBits(int[] arr) {
        return Arrays.stream(arr).boxed()
                .sorted((x, y) -> (Integer.bitCount(x) != Integer.bitCount(y))
                        ? Integer.compare(Integer.bitCount(x), Integer.bitCount(y))
                        : Integer.compare(x, y))
                .mapToInt(x -> x).toArray();
    }
}
