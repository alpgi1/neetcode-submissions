class Solution {
    public int maxProfit(int[] prices) {
        int left = 0, max = 0;
        for(int right = 0; right < prices.length; right++){
            max = Math.max(max, prices[right]- prices[left]);
            if(prices[right]- prices[left] < 0) left = right;
        }
        return max;
    }
}
