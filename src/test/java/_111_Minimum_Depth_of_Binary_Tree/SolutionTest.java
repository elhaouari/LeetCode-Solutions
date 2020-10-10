package _111_Minimum_Depth_of_Binary_Tree;

import org.junit.jupiter.api.Test;
import utils.TreeNode;
import utils.TreeNodePrinter;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testMinDepth(){

        TreeNode tree = new TreeNode(3);
        tree.left = new TreeNode(9);
        tree.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNodePrinter.printNode(tree);
        Solution s = new Solution();
        assertEquals(2, s.minDepth(tree));
    }
}