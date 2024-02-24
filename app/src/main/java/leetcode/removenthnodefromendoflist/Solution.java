package leetcode.removenthnodefromendoflist;

import java.util.ArrayList;
import leetcode.ListNode;

/*
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 * Time complexity: O(n)
 * Space complexity: O(n)
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        var nodes = new ArrayList<ListNode>();

        for (ListNode node = head; node != null; node = node.next) {
            nodes.add(node);
        }

        if (n == nodes.size()) {
            return head.next;
        }

        ListNode node = nodes.get(nodes.size() - n - 1);

        node.next = node.next.next;

        return head;
    }
}
