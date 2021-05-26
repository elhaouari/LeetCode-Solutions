package _397_IntegerReplacement;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/integer-replacement/
 */
public class Solution {

    public int integerReplacement(int n) {
        Map<Integer, Integer> cache = new HashMap<>();
        return integerReplacementHelper(n, cache);
    }

    private int integerReplacementHelper(int n, Map<Integer, Integer> cache) {
        if(cache.containsKey(n)) {
            return cache.get(n);
        }

        if(n==1) return 0;

        int result = 0;

        if(n%2 == 0) {
            result = 1 + integerReplacementHelper(n/2, cache);
        } else {
            if(n==Integer.MAX_VALUE) {
                result = integerReplacementHelper(n-1, cache);
            } else {
                int result1 = integerReplacementHelper(n-1, cache);
                int result2 = integerReplacementHelper(n+1, cache);

                result = 1 + Math.min(result1, result2);
            }

        }

        cache.put(n, result);

        return result;
    }

}
