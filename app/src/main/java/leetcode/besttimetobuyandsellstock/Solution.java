package leetcode.besttimetobuyandsellstock;

/*
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * Time complexity: O(n)
 * Space complexity: O(1)
 */
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int i = 1, minPrice = prices[0]; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }

        return maxProfit;
    }
}
