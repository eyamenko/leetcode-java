package leetcode.binarytreelevelordertraversal;

import java.util.ArrayList;
import java.util.List;
import leetcode.TreeNode;

/*
 * https://leetcode.com/problems/binary-tree-level-order-traversal/
 * Time complexity: O(n)
 * Space complexity: O(n)
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        var traversal = new ArrayList<List<Integer>>();

        levelOrder(root, 0, traversal);

        return traversal;
    }

    private void levelOrder(TreeNode node, int level, List<List<Integer>> traversal) {
        if (node == null) {
            return;
        }

        if (level >= traversal.size()) {
            traversal.add(new ArrayList<>());
        }

        traversal.get(level).add(node.val);

        levelOrder(node.left, level + 1, traversal);
        levelOrder(node.right, level + 1, traversal);
    }
}
