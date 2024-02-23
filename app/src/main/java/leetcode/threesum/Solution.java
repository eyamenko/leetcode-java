package leetcode.threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * https://leetcode.com/problems/3sum/
 * Time complexity: O(n^2)
 * Space complexity: O(n)
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<List<Integer>>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                for (int j = i + 1, k = nums.length - 1; j < k; ) {
                    int sum = nums[i] + nums[j] + nums[k];

                    if (sum == 0) {
                        triplets.add(List.of(nums[i], nums[j], nums[k]));

                        while (j < k && nums[j] == nums[j + 1]) {
                            j++;
                        }

                        while (j < k && nums[k] == nums[k - 1]) {
                            k--;
                        }
                    }

                    if (sum >= 0) {
                        k--;
                    }

                    if (sum <= 0) {
                        j++;
                    }
                }
            }
        }

        return triplets;
    }
}
