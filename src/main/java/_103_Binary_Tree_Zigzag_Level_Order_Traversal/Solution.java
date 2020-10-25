package _103_Binary_Tree_Zigzag_Level_Order_Traversal;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Problem link: https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
 */
public class Solution {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        levelOrder(levels, root, 0);
        for (int i = 1; i < levels.size(); i += 2) {
            Collections.reverse(levels.get(i));
        }

        return levels;
    }

    private void levelOrder(List<List<Integer>> levels, TreeNode node, int level) {
        if( node == null ) {
            return;
        }

        if( level == levels.size() ) {
            levels.add( new LinkedList<Integer>() );
        }

        levels.get( level ).add( node.val );

        levelOrder( levels, node.left, level + 1 );
        levelOrder( levels, node.right, level + 1 );
    }
}
