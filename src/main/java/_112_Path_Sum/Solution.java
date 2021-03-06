package _112_Path_Sum;

import utils.TreeNode;

/**
 * Problem link: https://leetcode.com/problems/path-sum/
 */
public class Solution {

    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) {
            return false;
        }

        if(root.left == null && root.right == null) {
            return sum == root.val;
        }

        return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
    }

}
