class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++) graph.add(new ArrayList<>());
        for(int[] e: edges){
            int a = e[0];
            int b = e[1];
            graph.get(a).add(b);
            graph.get(b).add(a);   
        }
        boolean[] seen = new boolean[n];
        int count = 0;
        for(int i = 0; i < n; i++){
            if(!seen[i]){
                dfs(graph, seen, i);
                count++;
            }
        }
        return count;
    }

    public void dfs(List<List<Integer>> graph, boolean[] seen, int n){
        List<Integer> list = graph.get(n);
        if(seen[n]) return;
        seen[n] = true;
        for(int i: list){
            if(!seen[i]){
                dfs(graph, seen, i);
            }
        }
    }
}
