package _77_Combinations;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/combinations/
 */
public class Solution {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        search(result, n, k, new ArrayList<>(), 1);
        return result;
    }

    void search(List<List<Integer>> result, int n, int k,
                List<Integer> combination, int number) {
        if (combination.size() == k) {
            result.add(new ArrayList<Integer>(combination));
            return;
        }
        if (combination.size() + (n - number + 1) < k) {
            return;
        }
        search(result, n, k, combination, number + 1);
        combination.add(number);
        search(result, n, k, combination, number + 1);
        combination.remove(combination.size() - 1);
    }
}
