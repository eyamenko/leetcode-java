package leetcode.uniquepaths;

/*
 * https://leetcode.com/problems/unique-paths/
 * Time complexity: O(mn)
 * Space complexity: O(mn)
 */
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        dp[m - 1][n - 1] = 1;

        return uniquePaths(0, 0, dp);
    }

    private int uniquePaths(int i, int j, int[][] dp) {
        if (i >= dp.length || j >= dp[i].length) {
            return 0;
        }

        if (dp[i][j] == 0) {
            dp[i][j] = uniquePaths(i + 1, j, dp) + uniquePaths(i, j + 1, dp);
        }

        return dp[i][j];
    }
}
