package challenges.januaryLeetcodingChallenge_2021.CheckIfTwoStringArraysAreEquivalent;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/580/week-2-january-8th-january-14th/3597/
 */
public class Solution {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return Arrays.stream(word1)
                .collect(Collectors.joining())
                .equals(Arrays.stream(word2).collect(Collectors.joining()));
    }

}
