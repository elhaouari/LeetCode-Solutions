package _114_Flatten_Binary_Tree_To_Linked_List;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testFlatten(){

        TreeNode left = new TreeNode(2, 3, 4);
        TreeNode right = new TreeNode(5, null, new TreeNode(6));
        TreeNode tree = new TreeNode(1, left, right);

        Solution s = new Solution();
        s.flatten(tree);
    }

}