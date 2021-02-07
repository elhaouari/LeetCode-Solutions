package _113_PathSumII;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/path-sum-ii/
 */
public class Solution {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> paths = new ArrayList<List<Integer>>();
        search(paths, new ArrayList<>(), root, sum);
        return paths;
    }

    void search(List<List<Integer>> paths, List<Integer> path, TreeNode node,
                int sum) {
        if (node == null) {
            return;
        }
        path.add(node.val);
        if (node.left == null && node.right == null) {
            if (sum == node.val) {
                paths.add(new ArrayList<Integer>(path));
            }
        } else {
            if (node.left != null) {
                search(paths, path, node.left, sum - node.val);
            }
            if (node.right != null) {
                search(paths, path, node.right, sum - node.val);
            }
        }
        path.remove(path.size() - 1);
    }
}
