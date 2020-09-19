package _3_Longest_Substring_Without_Repeating_Characters;

import java.util.HashSet;
import java.util.Set;

/**
 * Problem link: https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int maxLength = 0;
        int leftIndex = 0;
        for (int rightIndex = 0; rightIndex < s.length(); rightIndex++) {
            char ch = s.charAt(rightIndex);
            while (charSet.contains(ch)) {
                charSet.remove(s.charAt(leftIndex));
                leftIndex++;
            }
            charSet.add(ch);
            maxLength = Math.max(maxLength, rightIndex - leftIndex + 1);
        }
        return maxLength;
    }
}
