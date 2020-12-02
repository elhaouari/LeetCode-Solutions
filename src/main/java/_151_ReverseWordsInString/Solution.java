package _151_ReverseWordsInString;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Problem link: https://leetcode.com/problems/reverse-words-in-a-string/
 */
public class Solution {

    public String reverseWords(String s) {
        List<String> words = Arrays.stream(s.split(" ")).filter(part -> !part.isEmpty()).collect(Collectors.toList());
        Collections.reverse(words);

        return String.join(" ", words);
    }
}
