class Solution {
    public int maxProfit(int[] prices) {
        int buy,sell,maxprofit;
        maxprofit=0;
        buy=prices[0];

        for(int i=1;i<prices.length;i++){
            if(buy>prices[i]){
                buy=prices[i];
            }

            sell=prices[i];
            int profit=sell-buy;

            if(profit>maxprofit){
                maxprofit=profit;
            }


        }

        return maxprofit;
    }
}