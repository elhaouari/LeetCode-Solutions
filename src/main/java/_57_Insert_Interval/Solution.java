package _57_Insert_Interval;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem link: https://leetcode.com/problems/insert-interval/
 */
public class Solution {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList();
        for (int[] in : intervals) {
            if (in[1] < newInterval[0]) {
                list.add(in);
            } else if (newInterval[1] < in[0]) {
                list.add(newInterval);
                newInterval = in;
            } else {
                newInterval[0] = Math.min(newInterval[0], in[0]);
                newInterval[1] = Math.max(newInterval[1], in[1]);
            }
        }
        list.add(newInterval);

        return list.toArray(new int[list.size()][]);
    }

}
