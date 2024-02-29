package leetcode.twosum;

import java.util.HashMap;

/*
 * https://leetcode.com/problems/two-sum/
 * Time complexity: O(n)
 * Space complexity: O(n)
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        var indexes = HashMap.<Integer, Integer>newHashMap(nums.length);

        for (int i = 0; i < nums.length; i++) {
            Integer index = indexes.get(target - nums[i]);

            if (index != null) {
                return new int[] {index, i};
            }

            indexes.put(nums[i], i);
        }

        return new int[0];
    }
}
