package leetcode.sametree;

import leetcode.TreeNode;

/*
 * https://leetcode.com/problems/same-tree/
 * Time complexity: O(n)
 * Space complexity: O(n)
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null || p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
