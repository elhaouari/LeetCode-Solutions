package _617_MergeTwoBinaryTrees;

import utils.TreeNode;

/**
 * Problem link: https://leetcode.com/problems/merge-two-binary-trees/
 */
public class Solution {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return null;
        if (t1 == null) return t2;
        if (t2 == null) return t1;

        int r = t1.val + t2.val;

        TreeNode merged = new TreeNode(r);
        merged.left = mergeTrees(t1.left, t2.left);
        merged.right = mergeTrees(t1.right, t2.right);
        return merged;
    }


}
