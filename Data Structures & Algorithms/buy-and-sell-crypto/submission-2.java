class Solution {
    public int maxProfit(int[] prices) {
        int max=0, profit=0;
        int n = prices.length;
        int minBuy = prices[0];

        for (int i=1; i<n; i++) {
            profit = prices[i] - minBuy;
            
            if (minBuy > prices[i])
                minBuy = prices[i];

            if (max < profit)
                max = profit;
        }

        return max;
    }
}
