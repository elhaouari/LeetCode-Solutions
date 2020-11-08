package _108_ConvertSortedArrayToBinarySearchTree;

import utils.TreeNode;

/**
 * Problem llink: https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 */
public class Solution {

    public TreeNode sortedArrayToBST(int[] num) {
        return sortedArrayToBST(num, 0, num.length - 1);
    }

    TreeNode sortedArrayToBST(int[] num, int begin, int end) {
        if (begin > end) {
            return null;
        }
        int middle = (begin + end) / 2;
        TreeNode root = new TreeNode(num[middle]);
        root.left = sortedArrayToBST(num, begin, middle - 1);
        root.right = sortedArrayToBST(num, middle + 1, end);
        return root;
    }

}
