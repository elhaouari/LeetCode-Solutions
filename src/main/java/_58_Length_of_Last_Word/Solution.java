package _58_Length_of_Last_Word;

/**
 * Problem link: https://leetcode.com/problems/length-of-last-word/
 */
public class Solution {

    public int lengthOfLastWord(String s) {

        int result = 0;
        s = s.trim();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            }

            result++;
        }
        return result;
    }
}
