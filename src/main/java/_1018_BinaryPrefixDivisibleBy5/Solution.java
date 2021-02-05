package _1018_BinaryPrefixDivisibleBy5;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-prefix-divisible-by-5/
 */
public class Solution {

    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> answers = new ArrayList<>();
        long num=0;

        for (int j : A) {
            num = (num * 2 + j);
            answers.add(num % 5 == 0);
            num %= 5;
        }
        return answers;
    }
}
