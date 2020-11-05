package _100_SameTree;

import utils.TreeNode;

/**
 * Problem link: https://leetcode.com/problems/same-tree/
 */
public class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == q) {
            return true;
        }
        if (p == null || q == null || p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
