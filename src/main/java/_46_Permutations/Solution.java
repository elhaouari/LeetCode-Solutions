package _46_Permutations;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem link: https://leetcode.com/problems/permutations/
 */
public class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        if(nums==null) return result;

        //A boolean array to keep track of all the elements visited
        boolean[] used= new boolean[nums.length];
        List<Integer> permutation = new ArrayList<>();
        findallPermutations(nums, permutation, used, result);
        return result;
    }

    private void findallPermutations(int[] nums, List<Integer> permutation, boolean[] used,
                                     List<List<Integer>> result) {
        //We will only add those subsets whose length is 3
        if(permutation.size()==nums.length)
        {
            result.add(new ArrayList<>(permutation));
            //from here we do not want to recurse further
            return;
        }

        for(int i=0; i<nums.length; i++){
            //we will not use the marked cells
            if(used[i]) continue;
            //mark the cell so it is not used again
            permutation.add(nums[i]);
            used[i]= true;
            findallPermutations(nums, permutation, used, result);
            //backtracking
            permutation.remove(permutation.size()-1);
            used[i]=false;
        }

    }

}
