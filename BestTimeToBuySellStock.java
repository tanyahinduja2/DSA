class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        int dayProfit = 0;
        for(int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            dayProfit = prices[i] - min;
            if(profit < dayProfit) 
                profit = dayProfit;
        }
        return profit;
    }
}
