package _274_H_Index;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/h-index/
 */
public class Solution {

    public int hIndex(int[] citations) {
        Arrays.sort(citations);

        for (int h = citations.length;; --h) {
            if ((h == 0 || citations[citations.length - h] >= h)) {
                return h;
            }
        }
    }
}
