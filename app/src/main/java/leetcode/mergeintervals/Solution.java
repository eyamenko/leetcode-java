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
        int index = -1;
        int[][] merged = new int[left.length + right.length][];

        for (int l = 0, r = 0; l < left.length || r < right.length; ) {
            int[] interval;
            if (r >= right.length || (l < left.length && left[l][0] < right[r][0])) {
                interval = left[l];
                l++;
            } else {
                interval = right[r];
                r++;
            }

            if (index == -1 || merged[index][1] < interval[0]) {
                merged[++index] = interval;
            } else {
                merged[index][1] = Math.max(merged[index][1], interval[1]);
            }
        }

        int newLength = index + 1;

        return newLength == merged.length ? merged : Arrays.copyOf(merged, newLength);
    }
}
