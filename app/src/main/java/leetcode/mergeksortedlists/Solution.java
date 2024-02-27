package leetcode.mergeksortedlists;

import leetcode.ListNode;

/*
 * https://leetcode.com/problems/merge-k-sorted-lists/
 * Time complexity: O(nlogn)
 * Space complexity: O(logn)
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }

        return mergeSort(lists, 0, lists.length - 1);
    }

    private ListNode mergeSort(ListNode[] lists, int start, int end) {
        if (start == end) {
            return lists[start];
        }

        int mid = (start + end) / 2;

        return merge(mergeSort(lists, start, mid), mergeSort(lists, mid + 1, end));
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode head, tail;
        head = tail = null;

        while (left != null || right != null) {
            ListNode node;
            if (right == null || (left != null && left.val < right.val)) {
                node = left;
                left = left.next;
            } else {
                node = right;
                right = right.next;
            }

            if (head == null) {
                head = tail = node;
            } else {
                tail = tail.next = node;
            }
        }

        return head;
    }
}
