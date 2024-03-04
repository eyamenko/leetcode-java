package leetcode.binarytreemaximumpathsum;

import leetcode.TreeNode;

/*
 * https://leetcode.com/problems/binary-tree-maximum-path-sum/
 * Time complexity: O(n)
 * Space complexity: O(n)
 */
class Solution {
    public int maxPathSum(TreeNode root) {
        return maxSubPathSum(root)[1];
    }

    private int[] maxSubPathSum(TreeNode node) {
        if (node == null) {
            return new int[] {0, Integer.MIN_VALUE};
        }

        int[] left = maxSubPathSum(node.left);
        int[] right = maxSubPathSum(node.right);

        int maxSubPathSum = Math.max(left[0], right[0]);
        int minSubPathSum = Math.min(left[0], right[0]);

        left[0] = Math.max(node.val, node.val + maxSubPathSum);
        left[1] = Math.max(Math.max(left[0], left[0] + minSubPathSum), Math.max(left[1], right[1]));

        return left;
    }
}
