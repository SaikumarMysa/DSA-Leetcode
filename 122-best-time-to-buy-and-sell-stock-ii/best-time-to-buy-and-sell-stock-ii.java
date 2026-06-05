class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int totalProfit=0;
        int currPrice=prices[0];
        for(int i=1;i<n;i++){
            if(prices[i]>currPrice){
                int profit=prices[i]-currPrice;
                totalProfit+=profit;
                //updating the currPrice for the next iteration
                currPrice=prices[i];
            }else{
                currPrice=prices[i];
            }
        }
        
        return totalProfit;
    }
}