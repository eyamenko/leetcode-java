package leetcode;

import java.util.Objects;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(Integer... vals) {
        this(vals, 0);
    }

    private TreeNode(Integer[] vals, int index) {
        this.val = vals[index];

        int leftIndex = (index * 2) + 1;
        int rightIndex = (index * 2) + 2;

        if (leftIndex < vals.length && vals[leftIndex] != null) {
            this.left = new TreeNode(vals, leftIndex);
        }

        if (rightIndex < vals.length && vals[rightIndex] != null) {
            this.right = new TreeNode(vals, rightIndex);
        }
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null
                && obj instanceof TreeNode node
                && val == node.val
                && Objects.equals(left, node.left)
                && Objects.equals(right, node.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, left, right);
    }
}
