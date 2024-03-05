package leetcode.longestconsecutivesequence;

import java.util.HashSet;

/*
 * https://leetcode.com/problems/longest-consecutive-sequence/
 * Time complexity: O(n)
 * Space complexity: O(n)
 */
class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }

        int maxLength = 0;
        var set = HashSet.<Integer>newHashSet(nums.length);

        for (int num : nums) {
            set.add(num);
        }

        for (int num : nums) {
            if (set.remove(num)) {
                int length = 1;

                for (int left = num - 1; set.remove(left); left--) {
                    length++;
                }

                for (int right = num + 1; set.remove(right); right++) {
                    length++;
                }

                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }
}
