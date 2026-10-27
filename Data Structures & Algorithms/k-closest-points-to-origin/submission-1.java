class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Queue<int[]> minHeap = new PriorityQueue<>((a,b) -> a[0] - b[0]);

        for(int[] p : points){
            int dist = p[0] * p[0] + p[1] * p[1];
            minHeap.offer(new int[]{dist, p[0], p[1]});
        }

        int[][] ret = new int[k][2];
        for(int i = 0; i < k; i++){
            int[] a = minHeap.poll();
            ret[i] = new int[]{a[1], a[2]};
        }
        return ret;
    }
}
