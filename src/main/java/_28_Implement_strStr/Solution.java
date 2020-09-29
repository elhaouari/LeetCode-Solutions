package _28_Implement_strStr;

/**
 * Problem link: https://leetcode.com/problems/implement-strstr/
 */
public class Solution {

    public int strStr(String haystack, String needle) {
        if (needle.isEmpty() || haystack.equals(needle)) return 0;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            String substr = haystack.substring(i, i + needle.length());
            if (substr.equals(needle))
                return i;
        }

        return -1;
    }
}
