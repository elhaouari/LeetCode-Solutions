package _171_ExcelSheetColumnNumber;

/**
 * Problem link: https://leetcode.com/problems/excel-sheet-column-number/
 */
public class Solution {

    public int titleToNumber(String s) {
        int result = 0, place = 1;
        for(int i = s.length()-1; i >=0 ; i--){
            result += place * (s.charAt(i) - 'A' + 1);
            place*=26;
        }
        return result;
    }

}
