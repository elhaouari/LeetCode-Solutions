package _91_DecodeWays;

/**
 * https://leetcode.com/problems/decode-ways/
 */
class Solution {
    public int numDecodings(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        int prev = 0;
        int curr = 1;
        for (int i = 0; i < s.length(); ++i) {
            int next = 0;
            int oneDigit = Integer.parseInt(s.substring(i, i + 1));
            if (oneDigit >= 1 && oneDigit <= 9) {
                next += curr;
            }
            if (i != 0) {
                int twoDigit = Integer.parseInt(s.substring(i - 1, i + 1));
                if (twoDigit >= 10 && twoDigit <= 26) {
                    next += prev;
                }
            }

            prev = curr;
            curr = next;
        }

        return curr;
    }
}