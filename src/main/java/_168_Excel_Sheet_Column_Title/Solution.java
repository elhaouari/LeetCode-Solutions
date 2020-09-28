package _168_Excel_Sheet_Column_Title;

/**
 * Problem solution: https://leetcode.com/problems/excel-sheet-column-title/
 */
public class Solution {

    public String convertToTitle(int n) {
        String res = "";

        while (n > 0) {
            int mod = --n % 26;
            n /= 26;
            res = (char) (mod + 'A') + res;
        }

        return res;
    }

}
