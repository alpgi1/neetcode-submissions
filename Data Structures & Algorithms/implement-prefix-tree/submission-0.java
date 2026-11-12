class Node {
    Node[] children = new Node[26];
    boolean isEnd;
}

class PrefixTree {
    private final Node root = new Node();

    public void insert(String word) {
        Node cur = root;
        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';
            if (cur.children[idx] == null) cur.children[idx] = new Node();   // yoksa oluştur
            cur = cur.children[idx];                                          // bir alta in
        }
        cur.isEnd = true;                                                     // kelime burada bitiyor
    }

    public boolean search(String word) {
        Node node = walk(word);
        return node != null && node.isEnd;
    }

    public boolean startsWith(String prefix) {
        return walk(prefix) != null;
    }

    private Node walk(String s) {          // yolu yürü, vardığın düğümü döndür; yol yoksa null
        Node cur = root;
        for (char ch : s.toCharArray()) {
            cur = cur.children[ch - 'a'];
            if (cur == null) return null;
        }
        return cur;
    }
}