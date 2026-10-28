class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        Queue<Integer> maxHeap = new PriorityQueue<>((a,b)-> map.get(b) - map.get(a));
        HashSet<Integer> seen = new HashSet<>();
        for(int num: nums){
            if(!seen.contains(num)){
                maxHeap.offer(num);
                seen.add(num);
            }
        }
        int[] ret = new int[k];
        for(int i = 0; i< k; i++){
            ret[i] = maxHeap.poll();
        }
        return ret;
    }
}
