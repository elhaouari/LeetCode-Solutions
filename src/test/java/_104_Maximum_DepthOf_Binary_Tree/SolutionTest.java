package _104_Maximum_DepthOf_Binary_Tree;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testMaxDepth(){

        TreeNode input = new TreeNode(2, new TreeNode(3, new TreeNode(4), new TreeNode(5)), new TreeNode(4));
        Solution s = new Solution();
        assertEquals(3, s.maxDepth(input));
    }
}