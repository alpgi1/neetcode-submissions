class Solution {
    public int numIslands(char[][] grid) {
        boolean[][] seen = new boolean[grid.length][grid[0].length];
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int f = 0; f < grid[0].length; f++){
                if(grid[i][f] == '1' && seen[i][f] == false){
                    search(grid, seen, i, f);
                    count++;
                }
            }
        }
        return count;
    }

    public void search(char[][] grid, boolean[][] seen, int i, int f){
        if(grid[i][f] == '1' && seen[i][f] == false){
            seen[i][f] = true;
            if(i > 0){
                search(grid, seen, i-1, f);
            }
            if(f > 0){
                search(grid, seen, i, f-1);
            }
            if(i < grid.length-1){
                search(grid, seen, i+1, f);
            }
            if(f < grid[0].length-1){
                search(grid, seen, i, f+1);
            }
        }
    }
}
