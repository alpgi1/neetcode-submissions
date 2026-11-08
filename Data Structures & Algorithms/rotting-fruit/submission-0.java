class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int f = 0; f < grid[0].length; f++){
                if(grid[i][f] == 2){
                    queue.offer(new int[]{i,f,0});
                }else if(grid[i][f] == 1) count++;
            }
        }
        int lastMinute = 0;
        while(!queue.isEmpty()){
            int[] now = queue.poll();
            int i = now[0];
            int f = now[1];
            int minute = now[2];

            if(i > 0 && grid[i-1][f] == 1){
                lastMinute = minute+1;
                grid[i-1][f] = 2;
                queue.offer(new int[]{i-1,f,minute+1});
                count--;
            }
            if(i < grid.length -1 && grid[i+1][f] == 1){
                lastMinute = minute+1;
                grid[i+1][f] = 2;
                queue.offer(new int[]{i+1,f,minute+1});
                count--;
            }
            if(f > 0 && grid[i][f-1] == 1){
                lastMinute = minute+1;
                grid[i][f-1] = 2;
                queue.offer(new int[]{i,f-1,minute+1});
                count--;
            }
            if(f < grid[0].length -1 && grid[i][f+1] == 1){
                lastMinute = minute+1;
                grid[i][f+1] = 2;
                queue.offer(new int[]{i,f+1,minute+1});
                count--;
            }
        }
        return count > 0 ? -1 : lastMinute;
    }
}
