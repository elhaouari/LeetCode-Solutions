package _12_Integer_to_Roman;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/**
 * Problem Link: https://leetcode.com/problems/integer-to-roman/
 */
public class Solution {

    public String intToRoman(int num) {
        LinkedHashMap<Integer, String> number2roman = new LinkedHashMap<Integer, String>();
        number2roman.put(1000, "M");
        number2roman.put(900, "CM");
        number2roman.put(500, "D");
        number2roman.put(400, "CD");
        number2roman.put(100, "C");
        number2roman.put(90, "XC");
        number2roman.put(50, "L");
        number2roman.put(40, "XL");
        number2roman.put(10, "X");
        number2roman.put(9, "IX");
        number2roman.put(5, "V");
        number2roman.put(4, "IV");
        number2roman.put(1, "I");

        StringBuilder result = new StringBuilder();
        while (num != 0) {
            for (Entry<Integer, String> entry : number2roman.entrySet()) {
                int number = entry.getKey();
                String roman = entry.getValue();
                if (number <= num) {
                    result.append(roman);
                    num -= number;
                    break;
                }
            }
        }
        return result.toString();
    }

}
