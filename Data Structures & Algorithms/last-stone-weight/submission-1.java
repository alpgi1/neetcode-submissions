class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b - a);
        for(int s: stones){
            maxHeap.offer(s);
        }
        while(maxHeap.size() > 1){
            int a = maxHeap.poll();
            int b = maxHeap.poll();
            maxHeap.offer(Math.max(a-b,b-a));
        }
        return maxHeap.peek();
    }
}
