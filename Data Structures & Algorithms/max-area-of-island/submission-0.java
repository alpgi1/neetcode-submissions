class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] seen = new boolean[grid.length][grid[0].length];
        int max = 0;
        for(int i = 0; i < grid.length; i++){
            for(int f = 0; f < grid[0].length; f++){
                if(seen[i][f] == false && grid[i][f] == 1){
                    max = Math.max(max, search(grid, seen, i, f));
                }
            }
        }
        return max;
    }

    public int search(int[][] grid, boolean[][] seen, int i, int f){
        int count = 0;
        if(seen[i][f] == false && grid[i][f] == 1){
            count++;
            seen[i][f] = true;
            if(i> 0){
                count += search(grid, seen, i-1, f);
            }
            if(f> 0){
                count += search(grid, seen, i, f-1);
            }
            if(i < grid.length -1){
                count += search(grid, seen, i+1, f);
            }
            if(f < grid[0].length -1){
                count += search(grid, seen, i, f+1);
            }
        }
        return count;
    }
}
