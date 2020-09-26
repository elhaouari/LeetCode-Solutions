package _67_Add_Binary;

/**
 * Problem link: https://leetcode.com/problems/add-binary/
 */
public class Solution {

    public String addBinary(String a, String b) {
        StringBuilder s = new StringBuilder();

        int i = a.length(), j = b.length(), carry = 0;

        while (i > 0 || j > 0 || carry != 0) {
            carry = (i > 0 ? a.charAt(--i) - '0': 0)
                        + (j > 0 ? b.charAt(--j) - '0' : 0)
                       + carry;
            s.append(carry%2);
            carry /= 2;
        }

        return s.reverse().toString();
    }

}
