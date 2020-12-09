package _191_NumberOf_1_Bits;

/**
 * https://leetcode.com/problems/number-of-1-bits/
 */
public class Solution {

    public int hammingWeight(int n) {
        int count = 0;
        while(n!=0){
            count++;
            n &= (n-1);
        }

        return count;
    }
}
