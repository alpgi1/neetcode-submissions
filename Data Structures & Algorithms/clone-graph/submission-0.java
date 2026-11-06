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
        clone(node, map);
        return map.get(node);
    }

    public Node clone(Node node, HashMap<Node, Node> map){
        if(node == null) return null;
        Node copy;
        if(!map.containsKey(node)){
            copy = new Node(node.val);
            map.put(node, copy);
        }else{
            return map.get(node);
        }
        List<Node> ns = copy.neighbors;
        for(Node neighbor : node.neighbors){
            ns.add(clone(neighbor, map));
        }
        return copy;
    }
}