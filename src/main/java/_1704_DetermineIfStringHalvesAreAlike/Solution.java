package _1704_DetermineIfStringHalvesAreAlike;

/**
 * https://leetcode.com/problems/determine-if-string-halves-are-alike/
 */
public class Solution {

    public boolean halvesAreAlike(String s) {
        return lengthOfStringWithoutVowel(s.substring(0, s.length() / 2))
                == lengthOfStringWithoutVowel(s.substring(s.length() / 2));
    }

    int lengthOfStringWithoutVowel(String str) {
        return str.toLowerCase().replaceAll("[^aeiou]", "").length();
    }
}
