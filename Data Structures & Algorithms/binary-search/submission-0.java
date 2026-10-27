class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length-1;

        while(l<=r){
            int now = ((r-l) / 2) + l;
            if(nums[now] == target) return now;
            else if(nums[now] < target){
                l = now + 1;
            }else r = now -1;
        }
        return -1;
    }
}
