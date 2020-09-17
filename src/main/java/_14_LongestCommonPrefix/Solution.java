package _14_LongestCommonPrefix;

/**
 * Problem link: https://leetcode.com/problems/longest-common-prefix/
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        String longestPrefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(longestPrefix) != 0) {
                longestPrefix = longestPrefix.substring(0, longestPrefix.length() - 1);
                if (longestPrefix.isEmpty()) return "";
            }
        }
        return longestPrefix;
    }
}
