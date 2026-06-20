class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int currPrice = prices[0];

        int totalProfit = 0;

        for(int i=1; i<n; i++){
            if(prices[i] > currPrice){
                totalProfit += prices[i]-currPrice;
                currPrice = prices[i];
            }else{
                currPrice = prices[i];
            }
        }
    return totalProfit;
    }
}