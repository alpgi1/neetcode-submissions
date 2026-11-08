/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        HashMap<Node, Node> map = new HashMap<>();
        return search(node, map);
    }

    public Node search(Node node, HashMap<Node, Node> map){
        if(node == null) return null;
        if(map.containsKey(node)) return map.get(node);
        ArrayList<Node> neighbors = new ArrayList<>();
        Node copy = new Node(node.val);
        map.put(node, copy);
        for(Node neighbor: node.neighbors){
            neighbors.add(search(neighbor, map));
        }
        copy.neighbors = neighbors;
        return copy;
    }

}