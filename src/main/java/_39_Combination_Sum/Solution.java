package _39_Combination_Sum;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> combinations = new ArrayList<>();
        search(combinations, candidates, target, new ArrayList<>(), 0);

        return combinations;
    }

    private void search(
            List<List<Integer>> combinations,
            int[] candidates,
            int remain,
            List<Integer> solution,
            int index) {
        if (remain == 0) {
            combinations.add(new ArrayList<>(solution));

            return;
        }
        if (index == candidates.length) {
            return;
        }

        search(combinations, candidates, remain, solution, index + 1);

        if (remain >= candidates[index]) {
            solution.add(candidates[index]);
            search(combinations, candidates, remain - candidates[index], solution, index);
            solution.remove(solution.size() - 1);
        }
    }

}
