package leetcode.climbingstairs;

/*
 * https://leetcode.com/problems/climbing-stairs/
 * Time complexity: O(n)
 * Space complexity: O(1)
 */
class Solution {
    public int climbStairs(int n) {
        int first = 0;
        int second = 1;

        for (int i = 0; i < n; i++) {
            int temp = second;
            second = first + second;
            first = temp;
        }

        return second;
    }
}
