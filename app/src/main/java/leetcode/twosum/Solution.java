package leetcode.twosum;

import java.util.HashMap;

/*
 * https://leetcode.com/problems/two-sum/
 * Time complexity: O(n)
 * Space complexity: O(n)
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> diffs = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (diffs.containsKey(diff)) {
                return new int[] {diffs.get(diff), i};
            }

            diffs.put(nums[i], i);
        }

        return new int[0];
    }
}
