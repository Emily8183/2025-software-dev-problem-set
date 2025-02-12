/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int lowest_num = Integer.MAX_VALUE;
        int max_profit = Integer.MIN_VALUE;

        for (int i = 0; i < prices.length; i++) {
            lowest_num = Math.min(lowest_num, prices[i]);
            max_profit = Math.max(prices[i] - lowest_num, max_profit);
        }

        return max_profit;

        
    }
}
// @lc code=end

