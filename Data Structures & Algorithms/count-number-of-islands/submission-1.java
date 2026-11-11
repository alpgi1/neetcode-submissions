class Solution {
    public int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int f = 0; f < grid[0].length; f++){
                if(grid[i][f] == '1' && !visited[i][f]){
                    dfs(grid,visited, i,f);
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(char[][] grid, boolean[][] visited, int i, int f){
        visited[i][f] = true;
        if(i > 0 && grid[i-1][f] == '1' && !visited[i-1][f]){
            dfs(grid,visited, i-1,f);
        }
        if(i < grid.length - 1 && grid[i+1][f] == '1' && !visited[i+1][f]){
            dfs(grid,visited, i+1,f);
        }
        if(f > 0 && grid[i][f-1] == '1' && !visited[i][f-1]){
            dfs(grid,visited, i,f-1);
        }
        if(f < grid[0].length - 1 && grid[i][f+1] == '1' && !visited[i][f+1]){
            dfs(grid,visited, i,f+1);
        }
    }
}
