package _136_Single_Number;

import java.util.HashMap;

/**
 * Problem link: https://leetcode.com/problems/single-number/
 */
public class Solution {

    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> table = new HashMap<>();

        for (int i : nums) {
            table.put(i, table.getOrDefault(i, 0) + 1);
        }
        for (int i : nums) {
            if (table.get(i) == 1) {
                return i;
            }
        }
        return 0;
    }

}
