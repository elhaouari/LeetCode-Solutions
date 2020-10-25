package _102_Binary_Tree_Level_Order_Traversal;

import utils.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * Problem link: https://leetcode.com/problems/binary-tree-level-order-traversal/
 */
public class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> rtn = new LinkedList<>();

        levelOrder( rtn, root, 0);

        return rtn;
    }

    private void levelOrder( List<List<Integer>> levels, TreeNode node, int level) {
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
