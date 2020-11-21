package _202_HappyNumber;

import java.util.HashSet;
import java.util.Set;

/**
 * Problem link: https://leetcode.com/problems/happy-number/
 */
public class Solution {

    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (!seen.contains(n)) {
            seen.add(n);
            n = computeNext(n);
        }

        return n == 1;
    }

    int computeNext(int n) {
        return String.valueOf(n).chars().map(ch -> (ch - '0') * (ch - '0')).sum();
    }
}
