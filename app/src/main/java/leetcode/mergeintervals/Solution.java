package leetcode.mergeintervals;

import java.util.Arrays;

/*
 * https://leetcode.com/problems/merge-intervals/
 * Time complexity: O(nlogn)
 * Space complexity: O(n)
 */
class Solution {
    public int[][] merge(int[][] intervals) {
        return mergeSort(intervals, 0, intervals.length - 1);
    }

    private int[][] mergeSort(int[][] intervals, int start, int end) {
        if (start == end) {
            return new int[][] {intervals[start]};
        }

        int mid = (start + end) / 2;

        return merge(mergeSort(intervals, start, mid), mergeSort(intervals, mid + 1, end));
    }

    private int[][] merge(int[][] left, int[][] right) {
        int i = -1;
        int[][] intervals = new int[left.length + right.length][];

        for (int l = 0, r = 0; l < left.length || r < right.length; ) {
            int[] interval;
            if (r >= right.length || (l < left.length && left[l][0] < right[r][0])) {
                interval = left[l];
                l++;
            } else {
                interval = right[r];
                r++;
            }

            if (i == -1 || intervals[i][1] < interval[0]) {
                i++;
                intervals[i] = interval;
            } else {
                intervals[i][1] = Math.max(intervals[i][1], interval[1]);
            }
        }

        int newLength = i + 1;

        return newLength == intervals.length ? intervals : Arrays.copyOf(intervals, newLength);
    }
}
