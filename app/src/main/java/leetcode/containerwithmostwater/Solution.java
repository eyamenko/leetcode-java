package leetcode.containerwithmostwater;

/*
 * https://leetcode.com/problems/container-with-most-water/
 * Time complexity: O(n)
 * Space complexity: O(1)
 */
public class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;

        for (int left = 0, right = height.length - 1; left < right; ) {
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
