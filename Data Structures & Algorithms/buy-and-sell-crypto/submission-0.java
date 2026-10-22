class Solution {
    public int maxProfit(int[] prices) {
        int[] output = new int[]{0};

        for(int i = 0; i < prices.length; i++){
            for(int f = i + 1; f < prices.length; f++){
                if(prices[f] - prices[i] > output[0]) output[0] = prices[f] - prices[i];
            }
        }
        return output[0];    }
}
