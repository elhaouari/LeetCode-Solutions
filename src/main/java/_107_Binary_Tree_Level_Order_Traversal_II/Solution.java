package _107_Binary_Tree_Level_Order_Traversal_II;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Problem link: https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
 */
class Solution {
    public List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        levelOrder(root, 0);
        Collections.reverse(res);
        return res;
    }

    public void levelOrder(TreeNode root, int l){
        if(root == null) return;

        if(res.size()== l) res.add(new ArrayList<Integer>());

        levelOrder(root.left, l+1);
        levelOrder(root.right, l+1);

        res.get(l).add(root.val);

    }
}
