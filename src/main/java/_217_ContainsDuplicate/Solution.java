package _217_ContainsDuplicate;

import java.util.HashSet;

/**
 * https://leetcode.com/problems/contains-duplicate/
 */
public class Solution {

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> a = new HashSet<>();

        for (int n : nums) {
            if (a.contains(n))
                return false;
            a.add(n);
        }

        return true;
    }
}
