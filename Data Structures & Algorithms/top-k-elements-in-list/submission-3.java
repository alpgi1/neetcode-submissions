class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        Queue<Integer> maxHeap = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        for(int i: map.keySet()){
            maxHeap.offer(i);
        }
        int[] ret = new int[k];
        while(k>0){
            ret[--k] = maxHeap.poll();
        }
        return ret;
    }
}
