package challenges.januaryLeetcodingChallenge_2021.WordLadder;

import java.util.*;

/**
 * https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/580/week-2-january-8th-january-14th/3598/
 */
public class Solution {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);

        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet();

        queue.add(beginWord);
        visited.add(beginWord);

        int level = 0;

        while(!queue.isEmpty()) {
            int size = queue.size();
            level++;
            while(size-- > 0) {
                String word = queue.poll();
                if(endWord.equals(word))
                    return level;
                for(int i = 0; i < word.length(); i++) {
                    for(char c = 'a'; c <= 'z'; c++) {
                        String newWord = word.substring(0, i) + c + word.substring(i + 1);
                        if(wordSet.contains(newWord) && !visited.contains(newWord)) {
                            queue.add(newWord);
                            visited.add(newWord);
                        }
                    }
                }
            }
        }

        return 0;
    }
}
