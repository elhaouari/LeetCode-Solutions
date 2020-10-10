package _112_Path_Sum;

import org.junit.jupiter.api.Test;
import utils.TreeNode;
import utils.TreeNodePrinter;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testHasPathSum(){

        TreeNode tree = new TreeNode(5);
        tree.left = new TreeNode(4, new TreeNode(11), new TreeNode());
        tree.right = new TreeNode(8, new TreeNode(13), new TreeNode(4));

        Solution s = new Solution();
        assertTrue(s.hasPathSum(tree, 20));
    }
}