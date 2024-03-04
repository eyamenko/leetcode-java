package leetcode.constructbinarytreefrompreorderandinordertraversal;

import java.util.HashMap;
import java.util.Map;
import leetcode.TreeNode;

/*
 * https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 * Time complexity: O(n)
 * Space complexity: O(n)
 */
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 1) {
            return new TreeNode(preorder[0]);
        }

        var indexes = HashMap.<Integer, Integer>newHashMap(inorder.length);

        for (int i = 0; i < inorder.length; i++) {
            indexes.put(inorder[i], i);
        }

        return buildTree(preorder, 0, indexes, 0, inorder.length - 1);
    }

    private TreeNode buildTree(
            int[] preorder, int preorderIndex, Map<Integer, Integer> indexes, int min, int max) {
        if (min > max) {
            return null;
        }

        int index = indexes.get(preorder[preorderIndex]);
        int leftIndex = preorderIndex + 1;
        int rightIndex = leftIndex + index - min;

        TreeNode node = new TreeNode(preorder[preorderIndex]);

        node.left = buildTree(preorder, leftIndex, indexes, min, index - 1);
        node.right = buildTree(preorder, rightIndex, indexes, index + 1, max);

        return node;
    }
}
