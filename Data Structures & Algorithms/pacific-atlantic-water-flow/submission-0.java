class Solution {
    int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        boolean[][] pac = new boolean[heights.length][heights[0].length];
        boolean[][] atl = new boolean[heights.length][heights[0].length];
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < heights[0].length; i++){
            dfs(pac, 0,i,heights);
        }
        for(int i = 0; i < heights.length; i++){
            dfs(pac, i,0,heights);
        }
        for(int i = 0; i < heights[0].length; i++){
            dfs(atl, heights.length - 1,i,heights);
        }
        for(int i = 0; i < heights.length; i++){
            dfs(atl, i,heights[0].length - 1,heights);
        }
        for(int i = 0; i < heights.length; i++){
            for(int f = 0; f < heights[0].length; f++){
                if(atl[i][f] && pac[i][f]){
                    List<Integer> l = new ArrayList<>();
                    l.add(i);
                    l.add(f);
                    list.add(l);
                }
            }
        }
        return list;
    }

    public void dfs(boolean[][] arr, int i, int f, int[][] heights){
        arr[i][f] = true;
        for(int[] dir: dirs){
            int a = i + dir[0];
            int b = f + dir[1];
            if(a < 0 || b < 0 || a >= arr.length || b >= arr[0].length || heights[a][b] < heights[i][f] || arr[a][b]) continue;
            dfs(arr, a, b, heights);
        }
    }
}
