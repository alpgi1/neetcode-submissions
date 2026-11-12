class Solution {
    public boolean validTree(int n, int[][] edges) {
    if (edges.length != n - 1) return false;

    List<List<Integer>> graph = new ArrayList<>();
    for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
    for (int[] e : edges) {
        graph.get(e[0]).add(e[1]);     // iki yön de
        graph.get(e[1]).add(e[0]);
    }

    boolean[] seen = new boolean[n];
    dfs(0, graph, seen);
    for (boolean s : seen) if (!s) return false;   // ulaşılamayan düğüm var
    return true;
}

private void dfs(int node, List<List<Integer>> graph, boolean[] seen) {
    if (seen[node]) return;
    seen[node] = true;
    for (int next : graph.get(node)) dfs(next, graph, seen);
}
}
