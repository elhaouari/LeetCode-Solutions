package _101_Symmetric_Tree;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testIsSymmetric(){
        TreeNode input = new TreeNode(1);
        input.left = new TreeNode(2);
        input.right = new TreeNode(2);

        Solution s = new Solution();
        assertTrue(s.isSymmetric(input));
    }
}