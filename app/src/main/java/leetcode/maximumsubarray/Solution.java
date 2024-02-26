package leetcode.maximumsubarray;

/*
 * https://leetcode.com/problems/maximum-subarray/
 * Time complexity: O(n)
 * Space complexity: O(1)
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];

        for (int i = 1, currentSum = maxSum; i < nums.length; i++) {
            currentSum = Math.max(currentSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
