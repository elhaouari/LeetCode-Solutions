package _102_Binary_Tree_Level_Order_Traversal;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testLevelOrder(){

        var left = new TreeNode(9);
        var right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode input = new TreeNode(3, left, right);

        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(List.of(3));
        expected.add(List.of(9, 20));
        expected.add(List.of(15, 7));

        Solution s = new Solution();
        assertEquals(expected, s.levelOrder(input));
    }
}