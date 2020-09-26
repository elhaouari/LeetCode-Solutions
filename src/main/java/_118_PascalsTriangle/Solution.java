package _118_PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem link: https://leetcode.com/problems/pascals-triangle
 */
public class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            List<Integer> line = new ArrayList<Integer>();
            line.add(1);
            if (!list.isEmpty()) {
                for (int j = 2; j < i; j++) {
                    List<Integer> row = list.get(list.size() - 1);
                    line.add(row.get(j - 2) + row.get(j-1));
                }
                line.add(1);
            }

            list.add(line);
        }

        return list;
    }

}
