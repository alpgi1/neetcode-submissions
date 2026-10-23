/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        List<Node> list = new ArrayList<Node>();
        List<Node> listOriginal = new ArrayList<Node>();
        HashMap<Node,Integer> map = new HashMap<>();
        Node node = head;
        int f = 0;
        while(node != null){
            listOriginal.add(node);
            map.put(node ,f++);
            list.add(new Node(node.val));
            node = node.next;
        }
        for(int i = 0; i < list.size(); i++){
            if (i < list.size() - 1) {
                list.get(i).next = list.get(i + 1);
            }
            Node originalRandom = listOriginal.get(i).random;
            if (originalRandom != null) {
                list.get(i).random = list.get(map.get(originalRandom));
            }
        }


        return list.get(0);

    }
}
