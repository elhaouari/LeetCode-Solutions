package _114_Flatten_Binary_Tree_To_Linked_List;


import utils.TreeNode;

/**
 * Problem link: https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
 */
public class Solution {

    TreeNode prev = null;

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        if (prev != null) {
            prev.left = null;
            prev.right = root;
        }
        prev = root;
        TreeNode right = root.right;
        flatten(root.left);
        flatten(right);
    }
}
