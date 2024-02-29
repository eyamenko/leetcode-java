package leetcode.decodeways;

/*
 * https://leetcode.com/problems/decode-ways/
 * Time complexity: O(n)
 * Space complexity: O(n)
 */
class Solution {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0') {
            return 0;
        }

        if (s.length() == 1) {
            return 1;
        }

        int[] dp = new int[s.length() + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 1, j = 2; i < s.length(); i++, j++) {
            int number = s.charAt(i) - '0';

            if (number != 0) {
                dp[j] += dp[j - 1];
            }

            number += (s.charAt(i - 1) - '0') * 10;

            if (number >= 10 && number <= 26) {
                dp[j] += dp[j - 2];
            }
        }

        return dp[s.length()];
    }
}
