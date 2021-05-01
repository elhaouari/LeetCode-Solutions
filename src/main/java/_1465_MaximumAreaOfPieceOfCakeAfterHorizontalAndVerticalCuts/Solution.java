package _1465_MaximumAreaOfPieceOfCakeAfterHorizontalAndVerticalCuts;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * https://leetcode.com/problems/maximum-area-of-a-piece-of-cake-after-horizontal-and-vertical-cuts/
 */
public class Solution {

    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        return (int) (((long) computeMaxGap(h, horizontalCuts) * computeMaxGap(w, verticalCuts)) % 1_000_000_007);
    }

    int computeMaxGap(int limit, int[] cuts) {
        int[] values = IntStream.concat(IntStream.of(0, limit), Arrays.stream(cuts)).sorted().toArray();

        return IntStream.range(0, values.length - 1).map(i -> values[i + 1] - values[i]).max().getAsInt();
    }

}
