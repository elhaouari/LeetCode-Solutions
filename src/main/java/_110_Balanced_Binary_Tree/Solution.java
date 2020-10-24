package _110_Balanced_Binary_Tree;

import utils.TreeNode;

/**
 * Problem link: https://leetcode.com/problems/balanced-binary-tree/
 */
public class Solution {

    public boolean isBalanced(TreeNode root) {
        return findDepth(root) >= 0;
    }

    private int findDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int depthLeft = findDepth(node.left);
        int depthRight = findDepth(node.right);
        if (depthLeft < 0 || depthRight < 0
                || Math.abs(depthLeft - depthRight) > 1) {
            return -1;
        }
        return 1 + Math.max(depthLeft, depthRight);
    }
}
