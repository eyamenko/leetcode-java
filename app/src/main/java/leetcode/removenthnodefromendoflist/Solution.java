package leetcode.removenthnodefromendoflist;

/*
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 * Time complexity: O(n)
 * Space complexity: O(n)
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = remove(head, n) + 1;

        if (size == n) {
            return head.next;
        }

        return head;
    }

    private int remove(ListNode node, int n) {
        if (node == null) {
            return -1;
        }

        int index = remove(node.next, n) + 1;

        if (index == n) {
            node.next = node.next.next;
        }

        return index;
    }
}
