class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i = 0; i < prices.length - 1 ; i++){
            // int max = prices[i];
            int profit = 0;
            int maxCurrentProfit = 0;
            for(int j = i + 1; j < prices.length; j++){
                profit = prices[j] - prices[i];
                maxCurrentProfit = Math.max(maxCurrentProfit,profit);
            }
            maxProfit = Math.max(maxProfit,maxCurrentProfit);

        }
        return maxProfit;
    }
}
