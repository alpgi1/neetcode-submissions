class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b-a);
        for(int n: nums){
            maxHeap.offer(n);
        }
        while(k>1){
            k--;
            maxHeap.poll();
        }
        return maxHeap.peek();
    }
}
