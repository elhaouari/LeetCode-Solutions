package _530_MinimumAbsoluteDifferenceInBST;

import utils.TreeNode;

/**
 * https://leetcode.com/problems/minimum-absolute-difference-in-bst/
 */
public class Solution {

    Integer prevValue;
    int minDiff;

    public int getMinimumDifference(TreeNode root) {
        prevValue = null;
        minDiff = Integer.MAX_VALUE;

        search(root);

        return minDiff;
    }

    void search(TreeNode node) {
        if (node == null) {
            return;
        }

        search(node.left);

        if (prevValue != null) {
            minDiff = Math.min(minDiff, node.val - prevValue);
        }
        prevValue = node.val;

        search(node.right);
    }
}
