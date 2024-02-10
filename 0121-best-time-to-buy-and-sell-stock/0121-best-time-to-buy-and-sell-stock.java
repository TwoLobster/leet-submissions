class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0, min=prices[0];
        for(int i = 0; i<prices.length; i++){
           if(min>prices[i])min=prices[i];
            else{
                int profit=prices[i]-min;
                maxprofit=Math.max(profit, maxprofit);
            }
        }
        return maxprofit;
    }
}