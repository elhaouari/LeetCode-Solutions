package _113_Path_Sum_II;

import org.junit.jupiter.api.Test;
import utils.TreeNode;
import utils.TreeNodePrinter;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void test(){

        TreeNode left = new TreeNode(4, new TreeNode(11, 7, 2), null);
        TreeNode right = new TreeNode(8, new TreeNode(13), new TreeNode(4, 5, 1));
        TreeNode tree = new TreeNode(5, left, right);

        var expected = new ArrayList<List<Integer>>();
        expected.add(List.of(5, 4, 11, 2));
        expected.add(List.of(5,8,4,5));

        Solution s = new Solution();
        var actual = s.pathSum(tree, 22);

        assertEquals(expected, actual);
    }
}