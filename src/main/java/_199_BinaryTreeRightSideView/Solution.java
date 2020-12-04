package _199_BinaryTreeRightSideView;

import com.sun.source.tree.Tree;
import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem link: https://leetcode.com/problems/binary-tree-right-side-view/
 */
public class Solution {

    int maxDepth = -1;

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        rightSide(root, result, 0);
        return result;
    }

    private void rightSide(TreeNode node, List<Integer> result, int depth){
        if (node == null) return;

        if (depth > maxDepth) {
            maxDepth = depth;
            result.add(node.val);
        }
        rightSide(node.right, result, depth+1);
        rightSide(node.left, result, depth+1);
    }
}
