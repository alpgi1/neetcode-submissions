class Solution {
    public int[][] kClosest(int[][] points, int k) {
PriorityQueue<int[]> maxHeap =
            new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0]));
        for(int[] point: points){
            maxHeap.offer(new int[]{point[0]*point[0] + point[1]*point[1], point[0], point[1]});
        }
        while(maxHeap.size() > k){
            maxHeap.poll();
        }

        int[][] ret = new int[k][2];
        int i = 0;
        while(maxHeap.size() > 0){
            int[] p = maxHeap.poll();
            ret[i++] = new int[]{p[1], p[2]};
        }
        return ret;
    }
}
