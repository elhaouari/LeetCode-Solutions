package _242_ValidAnagram;

import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/valid-anagram/
 */
public class Solution {

        public boolean isAnagram(String s, String t) {
            return toKey(s).equals(toKey(t));
        }

        String toKey(String str) {
            return str.chars()
                    .sorted()
                    .mapToObj(ch -> String.valueOf((char) ch))
                    .collect(Collectors.joining());
        }
}
