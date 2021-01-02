package challenges.januaryLeetcodingChallenge_2021.FindACorrespondingNodeOfaBinaryTreeInaCloneOfThatTree;

import utils.TreeNode;

/**
 * https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/579/week-1-january-1st-january-7th/3590/
 */
public class Solution {

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null) return null;

        //Don't compare value. Compare the object
        if (original == target) return cloned;
        TreeNode left = getTargetCopy(original.left, cloned.left, target);

        if (left != null) return left;
        return getTargetCopy(original.right, cloned.right, target);
    }
}
