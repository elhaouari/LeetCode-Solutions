package _113_Path_Sum_II;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem link: https://leetcode.com/problems/path-sum-ii/
 */
public class Solution {

    private List<List<Integer>> result = new ArrayList<List<Integer>>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        helper(root, sum, new ArrayList<>());
        return result;
    }

    private void helper(TreeNode node , int sum, ArrayList<Integer> arr){

        if(node == null) return;

        arr.add(node.val);

        if( node.left == null && node.right == null && sum == node.val)
            result.add(new ArrayList<Integer>(arr));

        helper(node.left,sum - node.val, arr);
        helper(node.right,sum - node.val, arr);

        arr.remove(arr.size() - 1);
    }
}
