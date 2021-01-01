package challenges.challenge570.week2.PalindromePartitioning;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/explore/challenge/card/december-leetcoding-challenge/570/week-2-december-8th-december-14th/3565/
 */
public class Solution {

    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> list = new ArrayList<>();
        dfs(s,0,list,res);
        return res;
    }

    public void dfs(String s, int pos, List<String> list, List<List<String>> res){
        if(pos==s.length()) res.add(new ArrayList<>(list));
        else{
            for(int i=pos;i<s.length();i++){
                String part = s.substring(pos,i+1);
                if(isPalindrome(part)){
                    list.add(part);
                    dfs(s,i+1,list,res);
                    list.remove(list.size()-1);
                }
            }
        }
    }

    boolean isPalindrome(String s) {
        return new StringBuilder(s).reverse().toString().equals(s);
    }
}