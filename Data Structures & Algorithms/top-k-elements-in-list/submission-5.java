class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>(); // 1-> value 2-> how much
        Queue<Integer> maxHeap = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        for(int i: map.keySet()){
            maxHeap.offer(i);
        }
        int[] ret = new int[k];
        for(int i = 0; i < k; i++){
            ret[i] = maxHeap.poll();
        }
        return ret;
    }
}
