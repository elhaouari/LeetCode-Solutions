package challenges.januaryLeetcodingChallenge_2021.CheckArrayFormationThroughConcatenation;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/579/week-1-january-1st-january-7th/3589/
 */
class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {

        Map<Integer, Integer> valueToPieceIndex = new HashMap<>();
        for (int i = 0; i < pieces.length; ++i) {
            for (int value : pieces[i]) {
                valueToPieceIndex.put(value, i);
            }
        }

        int index = 0;
        while (index != arr.length) {
            if (!valueToPieceIndex.containsKey(arr[index])) {
                return false;
            }

            int pieceIndex = valueToPieceIndex.get(arr[index]);
            for (int i = 0; i < pieces[pieceIndex].length; ++i) {
                if (pieces[pieceIndex][i] != arr[index]) {
                    return false;
                }

                ++index;
            }
        }

        return true;
    }
}
