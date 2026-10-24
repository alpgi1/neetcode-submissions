class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> b[0] - a[0]);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            maxHeap.offer(new int[]{entry.getValue(), entry.getKey()});
        }
        int[] ret = new int[k];
        for(int i = 0; i < k; i++){
            ret[i] = maxHeap.poll()[1];
        }
        return ret;
    }
}
