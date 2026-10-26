class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 1) return true;
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(dp[i-1] == 0) dp[i] = 0;
            else{
                dp[i] = Math.max(dp[i-1] -1, nums[i]);
            }
        }
        return dp[nums.length-2] > 0;
    }
}
