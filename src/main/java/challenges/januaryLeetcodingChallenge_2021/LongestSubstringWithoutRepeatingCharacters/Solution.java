package challenges.januaryLeetcodingChallenge_2021.LongestSubstringWithoutRepeatingCharacters;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/579/week-1-january-1st-january-7th/3595/
 */
public class Solution {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int maxLength = 0;
        int leftIndex = 0;
        for (int rightIndex = 0; rightIndex < s.length(); ++rightIndex) {
            char ch = s.charAt(rightIndex);
            while (charSet.contains(ch)) {
                charSet.remove(s.charAt(leftIndex));
                ++leftIndex;
            }
            charSet.add(ch);
            maxLength = Math.max(maxLength, rightIndex - leftIndex + 1);
        }

        return maxLength;
    }
}
