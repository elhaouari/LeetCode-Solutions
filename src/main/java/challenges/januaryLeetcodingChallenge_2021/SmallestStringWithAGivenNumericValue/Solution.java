package challenges.januaryLeetcodingChallenge_2021.SmallestStringWithAGivenNumericValue;

/**
 * https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/582/week-4-january-22nd-january-28th/3619/
 */
public class Solution {

    public String getSmallestString(int n, int k) {
        StringBuilder result = new StringBuilder();
        while (n != 0) {
            int value = Math.max(1, k - 26 * (n - 1));
            result.append((char) (value + 'a' - 1));

            --n;
            k -= value;
        }

        return result.toString();
    }
}
