package _118_PascalsTriangle_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Problem link: https://leetcode.com/problems/pascals-triangle-ii
 */
public class Solution {

    public List getRow(int rowIndex) {
        int[] row = new int[rowIndex + 1];
        row[0] = 1;
        row[rowIndex] = 1;
        for(int i = 1; i < (rowIndex + 2) / 2; i++){
            row[i] = (int)((long)row[i - 1] * (rowIndex - i + 1) / i);
            row[rowIndex - i] = row[i];
        }
        return Arrays.stream(row).boxed().collect(Collectors.toList());
    }

}
