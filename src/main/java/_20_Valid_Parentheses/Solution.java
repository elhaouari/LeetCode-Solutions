package _20_Valid_Parentheses;

import java.util.Stack;

/**
 * Problem Link: https://leetcode.com/problems/valid-parentheses/
 */
public class Solution {

    public boolean isValid(String s) {

        Stack<Character> parentheses = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                parentheses.push(c);
            }
            else if ( parentheses.size() == 0 || c != inverseOf(parentheses.pop()) ) return false;

        }
        return parentheses.size() == 0;
    }

    public Character inverseOf(Character c) {
        return c == '(' ? ')' : c == '[' ? ']' : '}';
    }
}
