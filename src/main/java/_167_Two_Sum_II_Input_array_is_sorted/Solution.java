package _167_Two_Sum_II_Input_array_is_sorted;

import java.util.LinkedHashMap;

/**
 * Problem link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 */
public class Solution {

    public int[] twoSum(int[] numbers, int target) {

        var map = new LinkedHashMap<Integer, Integer>();
        map.put(target - numbers[0], 1);
        var r = new int[2];
        for (int i = 1; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])) {
                r[0] = map.get(numbers[i]);
                r[1] = i+1;
                return r;
            }
            map.put(target - numbers[i], i + 1);
        }
        return r;
    }

}
