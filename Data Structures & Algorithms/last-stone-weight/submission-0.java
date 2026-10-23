class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone: stones){
            maxHeap.offer(stone);
        }

        while(maxHeap.size() > 1){
            int a = maxHeap.poll() - maxHeap.poll();
            if(a != 0) maxHeap.offer(a);
        }
        if(maxHeap.size() == 0) return 0;
        return maxHeap.poll();
    }
}
