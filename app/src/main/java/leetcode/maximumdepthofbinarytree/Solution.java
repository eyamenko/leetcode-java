package leetcode.maximumdepthofbinarytree;

import leetcode.TreeNode;

/*
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * Time complexity: O(n)
 * Space complexity: O(n)
 */
class Solution {
    public int maxDepth(TreeNode root) {
        return maxDepth(root, 0);
    }

    private int maxDepth(TreeNode node, int level) {
        if (node == null) {
            return level;
        }

        return Math.max(maxDepth(node.left, level + 1), maxDepth(node.right, level + 1));
    }
}
