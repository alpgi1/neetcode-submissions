class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Queue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b-a);
        for(int i = 0; i < k; i++){
            maxHeap.offer(nums[i]);
        }
        int l = 0;
        int[] ret = new int[nums.length - k + 1];
        for(int r = k; r < nums.length; r++){
            ret[l] = maxHeap.peek();
            maxHeap.remove(nums[l]);
            maxHeap.offer(nums[r]);
            l++;
        }
        ret[l] = maxHeap.peek();
        return ret;
    }
}
