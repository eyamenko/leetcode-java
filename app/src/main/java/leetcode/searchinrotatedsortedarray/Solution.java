package leetcode.searchinrotatedsortedarray;

/*
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 * Time complexity: O(logn)
 * Space complexity: O(1)
 */
class Solution {
    public int search(int[] nums, int target) {
        for (int start = 0, end = nums.length - 1; start <= end; ) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            int prev = mid - 1;
            int next = mid + 1;

            if ((sorted(nums, start, prev) && contains(nums, target, start, prev))
                    || (sorted(nums, next, end) && !contains(nums, target, next, end))) {
                end = prev;
            } else {
                start = next;
            }
        }

        return -1;
    }

    private boolean sorted(int[] nums, int start, int end) {
        return start >= 0 && end < nums.length && start <= end && nums[start] <= nums[end];
    }

    private boolean contains(int[] nums, int target, int start, int end) {
        return nums[start] <= target && target <= nums[end];
    }
}
