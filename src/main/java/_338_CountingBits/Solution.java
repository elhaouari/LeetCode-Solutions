package _338_CountingBits;

/**
 * https://leetcode.com/problems/counting-bits/
 */
public class Solution {

    public int[] countBits(int num) {
        int []dp = new int[num+1];
        dp[0] = 0;

        int k = 1;
        for(int i=1;i<=num;i++){
            if(k*2 == i){
                k = k*2;
            }
            dp[i] = dp[i-k]+1;
        }
        return dp;
    }
}
