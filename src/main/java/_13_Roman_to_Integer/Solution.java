package _13_Roman_to_Integer;

import java.util.HashMap;

/**
 * Problem Link: https://leetcode.com/problems/roman-to-integer/submissions/
 */
public class Solution {

    public int romanToInt(String s) {
        if (s.length() == 0) return 0;

        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);

        int result = hashMap.get(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            char before = s.charAt(i-1);
            if (
                    ((c == 'V' || c == 'X') && before == 'I') ||
                    ((c == 'L' || c == 'C') && before == 'X') ||
                    ((c == 'D' || c == 'M') && before == 'C')
            ) {
                result -= 2 * hashMap.get(before);
            }

            result += hashMap.get(c);
        }
        return result;
    }
}
