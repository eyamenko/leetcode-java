package leetcode;

import java.util.Objects;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int... vals) {
        this(vals, 0);
    }

    private ListNode(int[] vals, int i) {
        this.val = vals[i];

        i++;

        if (i < vals.length) {
            this.next = new ListNode(vals, i);
        }
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null
                && obj instanceof ListNode node
                && val == node.val
                && Objects.equals(next, node.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }
}
