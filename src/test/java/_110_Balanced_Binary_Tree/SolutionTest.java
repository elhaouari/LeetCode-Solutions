package _110_Balanced_Binary_Tree;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testIsBalanced(){
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));

        Solution s = new Solution();
        assertTrue(s.isBalanced(treeNode));
    }
}