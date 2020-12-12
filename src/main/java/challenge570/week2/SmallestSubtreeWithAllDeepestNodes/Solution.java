package challenge570.week2.SmallestSubtreeWithAllDeepestNodes;

import utils.TreeNode;

/**
 * https://leetcode.com/explore/challenge/card/december-leetcoding-challenge/570/week-2-december-8th-december-14th/3563/
 */
public class Solution {

    public TreeNode subtreeWithAllDeepest(TreeNode root) {

        if(root == null)
            return null;

        int left = height(root.left);
        int right = height(root.right);

        if(left == right)
            return root;
        else if(left < right)
            return subtreeWithAllDeepest(root.right);
        else
            return subtreeWithAllDeepest(root.left);

    }

    public int height(TreeNode root){
        if(root == null)
            return 0;

        return 1 + Math.max(height(root.left), height(root.right));
    }
}
