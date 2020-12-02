package _172_FactorialTrailingZeroes;

/**
 * Problem link: https://leetcode.com/problems/factorial-trailing-zeroes/
 */
public class Solution {

    public int trailingZeroes(int n) {
        int trailingZeroNum = 0;
        while (n != 0) {
            trailingZeroNum += n / 5;
            n /= 5;
        }
        return trailingZeroNum;
    }
}
