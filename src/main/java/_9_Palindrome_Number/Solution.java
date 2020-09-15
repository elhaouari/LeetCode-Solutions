package _9_Palindrome_Number;

/**
 * Problem Link: https://leetcode.com/problems/palindrome-number/
 */
class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int rev = 0;
        int tmpX = x;
        while (tmpX != 0) {
            int pop = tmpX % 10;
            tmpX /= 10;
            rev = rev * 10 + pop;
        }

        return x == rev;
    }
}
