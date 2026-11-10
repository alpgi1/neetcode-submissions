class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0], max = 0;
        for(int r = 1; r < prices.length; r++){
            if(prices[r] < min){
                min = prices[r];
            }else{
                max = Math.max(max, prices[r] -min);
            }
        }
        return max;
    }
}
