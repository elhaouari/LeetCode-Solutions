package _139_WordBreak;

import java.util.HashSet;
import java.util.List;

/**
 * Problem link: https://leetcode.com/problems/word-break/
 */
public class Solution {

    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>(wordDict);

        boolean [] dp = new boolean[s.length()+1];
        dp[0] = true;
        for(int len  = 1; len < s.length()+1 ; len++){
            for(int i = 0; i < len; i++){
                if(dp[i] && set.contains(s.substring(i,len))){
                    dp[len] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
