package leetcode.mergeksortedlists;

import leetcode.ListNode;

/*
 * https://leetcode.com/problems/merge-k-sorted-lists/
 * Time complexity: O(nlogn)
 * Space complexity: O(logn)
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        return merge(lists, 0, lists.length);
    }

    private ListNode merge(ListNode[] lists, int start, int end) {
        int length = end - start;

        if (length == 0) {
            return null;
        }

        if (length == 1) {
            return lists[start];
        }

        int mid = (start + end) / 2;

        return merge(merge(lists, start, mid), merge(lists, mid, end));
    }

    private ListNode merge(ListNode left, ListNode right) {
        if (left == null) {
            return right;
        }

        if (right == null) {
            return left;
        }

        ListNode head, tail;
        head = tail = null;

        while (left != null && right != null) {
            if (left.val < right.val) {
                if (head == null) {
                    head = tail = left;
                } else {
                    tail = tail.next = left;
                }
                left = left.next;
            } else {
                if (head == null) {
                    head = tail = right;
                } else {
                    tail = tail.next = right;
                }
                right = right.next;
            }
        }

        if (left == null) {
            tail.next = right;
        }

        if (right == null) {
            tail.next = left;
        }

        return head;
    }
}
