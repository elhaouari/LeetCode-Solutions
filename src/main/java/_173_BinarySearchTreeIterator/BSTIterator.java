package _173_BinarySearchTreeIterator;

import utils.TreeNode;

import java.util.Stack;

/**
 * https://leetcode.com/problems/binary-search-tree-iterator/
 */
public class BSTIterator {

    Stack<TreeNode> stack;


    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        _leftmostInorder(root);
    }

    private void _leftmostInorder(TreeNode root) {
        while (root != null) {
            this.stack.push(root);
            root = root.left;
        }
    }

    public int next() {
        TreeNode topmostNode = this.stack.pop();
        if (topmostNode.right != null) {
            this._leftmostInorder(topmostNode.right);
        }
        return topmostNode.val;
    }

    public boolean hasNext() {
        return this.stack.size() > 0;
    }
}
