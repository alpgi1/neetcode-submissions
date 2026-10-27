class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i : nums){
            sum+=i;
        }
        if(sum %2 != 0) return false;
        int search = sum/2;

        boolean[] dp = new boolean[search+1];
        dp[0] = true;
        for(int num: nums){
            for (int s = search; s >= num; s--) {
                if (dp[s - num]) {
                    dp[s] = true;
                }
            }
        }
        return dp[search];
    }
}
