package challenges.januaryLeetcodingChallenge_2021.KthMissingPositiveNumber;

/**
 * https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/579/week-1-january-1st-january-7th/3594/
 */
public class Solution {

    public int findKthPositive(int[] arr, int k) {
        int N = arr.length + k;
        int idx = 0;
        for (int i = 1; i <= N; i++) {
            if (idx >= arr.length || arr[idx] != i)
                k--;
            else
                idx++;
            if (k == 0)
                return i;
        }
        return -1;
    }
}
