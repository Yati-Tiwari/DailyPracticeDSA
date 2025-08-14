// Last updated: 8/14/2025, 11:22:29 AM
class Solution {
    public int maxProfit(int[] prices, int fee) {
        int Sell=0;
        int Hold = -prices[0];
        for (int i = 1;i < prices.length;i++) {
            Sell = Math.max(Sell,Hold + prices[i] - fee);
            Hold = Math.max(Hold,Sell - prices[i]);
        }
        return Sell;
    }
}
