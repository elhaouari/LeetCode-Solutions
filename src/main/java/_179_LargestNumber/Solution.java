package _179_LargestNumber;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/largest-number/
 */
public class Solution {
    public String largestNumber(int[] nums) {
        int len = nums.length;

        List<String> list = new ArrayList<>(len);

        for (int num : nums) list.add(Integer.toString(num));

        list.sort((o1, o2) -> (o1 + o2).compareTo(o2 + o1));

        StringBuilder sb = new StringBuilder();

        for (int i = len - 1; i >= 0; i--) {

            if (i == len - 1 && list.get(i).equals("0")) {
                sb.append("0");
                break;
            }

            sb.append(list.get(i));
        }

        return sb.toString();
    }
}
