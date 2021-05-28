package _1704_DetermineIfStringHalvesAreAlike;


import java.util.Set;

/**
 * https://leetcode.com/problems/determine-if-string-halves-are-alike/
 */
public class Solution {

    public int getVowelCount(Set<String> vowels, String s)
    {
        int vowelCounter = 0;

        for(int i = 0; i < s.length(); i++)
        {
            if(vowels.contains(String.valueOf(s.charAt(i))))
                vowelCounter++;
        }
        return vowelCounter;
    }

    public boolean halvesAreAlike(String s) {
        Set<String> vowels = Set.of("a", "e", "i", "o", "u", "A", "E", "I", "O", "U");

        String s1 = s.substring(0, s.length() / 2);
        String s2 = s.substring(s.length() / 2);

        int vowelsS1 = getVowelCount(vowels,s1);
        int vowelsS2 = getVowelCount(vowels,s2);

        return vowelsS1 == vowelsS2;
    }
}
