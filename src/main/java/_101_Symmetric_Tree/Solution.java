package _101_Symmetric_Tree;

import utils.TreeNode;

/**
 * Problem link: https://leetcode.com/problems/symmetric-tree/
 */
public class Solution {

    public boolean isSymmetric(TreeNode root) {
        return isMiror(root, root);
    }

    public boolean isMiror(TreeNode t1, TreeNode t2){
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        return t1.val == t2.val &&
                isMiror(t1.left, t2.right) &&
                isMiror(t1.right, t2.left);
    }

}
