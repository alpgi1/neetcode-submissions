class Solution {
    public int rob(int[] nums) {
        if(nums.length < 2)return nums[0];
        int[] dp = new int[nums.length+1];
        dp[0] = 0;
        dp[1] = nums[0];

        for(int i = 1; i < nums.length-1; i++){
            dp[i+1] = Math.max(nums[i] + dp[i-1], dp[i]);
        }

        int[] dp1 = new int[nums.length+1];
        dp1[0] = 0;
        dp1[1] = 0;

        for(int i = 1; i < nums.length; i++){
            dp1[i+1] = Math.max(nums[i] + dp1[i-1], dp1[i]);
        }

        return Math.max(Math.max(dp[nums.length-1], dp[nums.length-2]), Math.max(dp1[nums.length], dp1[nums.length-1]));
    }
}
