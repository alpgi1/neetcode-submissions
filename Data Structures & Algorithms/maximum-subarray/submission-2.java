class Solution {
    public int maxSubArray(int[] nums) {
        int[] dp = nums.clone();
        int max = dp[0];
        for(int i = 1; i< nums.length; i++){
            dp[i] = Math.max(dp[i], dp[i]+dp[i-1]);
            max = Math.max(dp[i], max);
        }
        return max;
    }
}
