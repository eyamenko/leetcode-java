package leetcode.jumpgame;

/*
 * https://leetcode.com/problems/jump-game/
 * Time complexity: O(n)
 * Space complexity: O(1)
 */
class Solution {
    public boolean canJump(int[] nums) {
        for (int i = 1, j = nums[0];
                i < nums.length && j < nums.length;
                j = Math.max(j, nums[i] + i), i++) {
            if (j < i) {
                return false;
            }
        }

        return true;
    }
}
