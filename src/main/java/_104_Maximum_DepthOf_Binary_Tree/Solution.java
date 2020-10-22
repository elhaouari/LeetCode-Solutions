package _104_Maximum_DepthOf_Binary_Tree;

import utils.TreeNode;

/**
 * Problem link: https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
public class Solution {

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

}
