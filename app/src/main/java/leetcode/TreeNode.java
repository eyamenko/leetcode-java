package leetcode;

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
}
