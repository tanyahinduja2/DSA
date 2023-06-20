class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        int currProfit = 0;
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < min) {
                min = prices[i];
            }
            currProfit = prices[i] - min;
            if(profit < currProfit) {
                profit = currProfit;
            }
        }
        return profit;
    }
}
