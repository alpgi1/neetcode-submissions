class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int INF = 2147483647;
        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0; i < grid.length; i++){
            for(int f = 0; f < grid[0].length; f++){
                if(grid[i][f] == 0){
                    queue.offer(new int[]{i,f});
                }
            }
        }
        while(!queue.isEmpty()){
            int[] location = queue.poll();
            int i = location[0];
            int f = location[1];
            int cur = grid[i][f];
            if(i > 0 && grid[i-1][f] == INF){
                grid[i-1][f] = cur+1;
                queue.offer(new int[]{i-1, f});
            }
            if(i < grid.length -1 && grid[i+1][f] == INF){
                grid[i+1][f] = cur+1;
                queue.offer(new int[]{i+1, f});
            }
            if(f > 0 && grid[i][f-1] == INF){
                grid[i][f-1] = cur+1;
                queue.offer(new int[]{i, f-1});
            }
            if(f < grid[0].length -1 && grid[i][f+1] == INF){
                grid[i][f+1] = cur+1;
                queue.offer(new int[]{i, f+1});
            }
        }
    }
}
