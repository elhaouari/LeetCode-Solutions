package _66_Plus_One;

/**
 * Problem link: https://leetcode.com/problems/plus-one/
 */
public class Solution {

    public int[] plusOne(int[] digits) {

        int plusOne = 0;
        for(int i = digits.length - 1; i >= 0; i--) {
            plusOne = digits[i] + 1;
            digits[i] = plusOne % 10;
            if (plusOne - digits[i] == 0) break;
        }

        if (plusOne == 10) {
            int[] arrayPlusOne = new int[digits.length + 1];
            arrayPlusOne[0] = 1;
            for(int i = 1; i < arrayPlusOne.length; i++) {
                arrayPlusOne[i] = digits[i-1];
            }
            return arrayPlusOne;
        }
        return digits;
    }

}
