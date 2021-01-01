package challenges.challenge570.week3.ValidateBinarySearchTree;

import utils.TreeNode;

/**
 * https://leetcode.com/explore/challenge/card/december-leetcoding-challenge/571/week-3-december-15th-december-21st/3568/
 */
public class Solution {

    public boolean isValidBST(TreeNode root) {
        return check(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean check(TreeNode root, long lower, long upper) {
        if (root == null) {
            return true;
        }
        if (root.val < lower || root.val > upper) {
            return false;
        }

        return check(root.left, lower, root.val - 1L) && check(root.right, root.val + 1L, upper);
    }
}
