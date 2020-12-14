package _1561_MaximumNumberOfCoinsYouCanGet;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/maximum-number-of-coins-you-can-get/
 */
public class Solution {

    public int maxCoins(int[] piles) {
        piles = Arrays.stream(piles).boxed().sorted().mapToInt(x -> x).toArray();

        int result = 0;
        for (int i = piles.length / 3; i < piles.length; i += 2) {
            result += piles[i];
        }

        return result;
    }
}
