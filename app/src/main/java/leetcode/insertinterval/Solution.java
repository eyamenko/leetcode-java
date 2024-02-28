package leetcode.insertinterval;

import java.util.Arrays;

/*
 * https://leetcode.com/problems/insert-interval/
 * Time complexity: O(n)
 * Space complexity: O(n)
 */
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int iIndex = 0;
        int mIndex = -1;
        int[][] merged = new int[intervals.length + 1][];

        while (iIndex < intervals.length && intervals[iIndex][1] < newInterval[0]) {
            merged[++mIndex] = intervals[iIndex];
            iIndex++;
        }

        merged[++mIndex] = newInterval;

        while (iIndex < intervals.length && intervals[iIndex][0] <= merged[mIndex][1]) {
            merged[mIndex][0] = Math.min(merged[mIndex][0], intervals[iIndex][0]);
            merged[mIndex][1] = Math.max(merged[mIndex][1], intervals[iIndex][1]);
            iIndex++;
        }

        while (iIndex < intervals.length) {
            merged[++mIndex] = intervals[iIndex];
            iIndex++;
        }

        int newLength = mIndex + 1;

        return newLength == merged.length ? merged : Arrays.copyOf(merged, newLength);
    }
}
