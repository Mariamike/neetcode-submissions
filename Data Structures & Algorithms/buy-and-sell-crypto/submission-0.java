
class Solution {
    public int maxProfit(int[] prices) {
        
        int left = 0; 
        int right = 1;
        int maxProfit = 0;
        int profit = 0;
    while(right < prices.length) {
        if(prices[left] < prices[right]) {
            profit = prices[right] - prices[left];
            maxProfit = Math.max(maxProfit, profit);
        } else {
            left = right;
        }
         right = right + 1; 
    }
        return maxProfit;
    }
}
