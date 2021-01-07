package _49_GroupAnagrams;

import java.util.*;

/**
 * https://leetcode.com/problems/group-anagrams/
 */
public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result=new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();

        for(String tmp:strs)
        {
            char[] arr=tmp.toCharArray();
            Arrays.sort(arr);
            String word=String.valueOf(arr);

            List<String> list=map.get(word);
            if(list==null)
            {
                list=new ArrayList<>();
                map.put(word,list);

                list.add(tmp);

                result.add(list);
            }
            else
            {
                list.add(tmp);
            }
        }

        return result;
    }
}
