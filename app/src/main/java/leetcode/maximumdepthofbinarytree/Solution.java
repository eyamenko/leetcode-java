package leetcode.maximumdepthofbinarytree;

import leetcode.TreeNode;

/*
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * Time complexity: O(n)
 * Space complexity: O(n)
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
