class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int max = 0;
        for(int i = 0; i< grid.length; i++){
            for(int f = 0; f< grid[0].length; f++){
                if(grid[i][f] == 1 && !visited[i][f]){
                    max = Math.max(max, dfs(grid, visited, i,f));
                }
            }
        }
        return max;
    }

    public int dfs(int[][] grid, boolean[][] visited, int i, int f){
        visited[i][f] = true;
        int ret = 1;
        if(i > 0 && grid[i-1][f] == 1 && !visited[i-1][f]){
            ret+=dfs(grid,visited, i-1,f);
        }
        if(i < grid.length - 1 && grid[i+1][f] == 1 && !visited[i+1][f]){
            ret+=dfs(grid,visited, i+1,f);
        }
        if(f > 0 && grid[i][f-1] == 1 && !visited[i][f-1]){
            ret+=dfs(grid,visited, i,f-1);
        }
        if(f < grid[0].length - 1 && grid[i][f+1] == 1 && !visited[i][f+1]){
            ret+=dfs(grid,visited, i,f+1);
        }
        return ret;
    }
}
