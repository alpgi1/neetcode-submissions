class Node {
    Node[] children = new Node[26];
    boolean isEnd;
}

class WordDictionary {
    private Node main;

    public WordDictionary() {
        main = new Node();
    }

    public void addWord(String word) {
        Node cur = main;
        for(int i = 0; i < word.length(); i++){
            int inx = word.charAt(i) - 'a';
            if(cur.children[inx] == null){
                cur.children[inx] = new Node();
            }
            cur = cur.children[inx];
            if(i == word.length() - 1) cur.isEnd = true;
        }
    }

    public boolean search(String word) {
    return dfs(word, 0, main);
}

private boolean dfs(String word, int i, Node node) {
    if (i == word.length()) return node.isEnd;           // kelime bitti: burada bir kelime bitiyor mu?

    char c = word.charAt(i);
    if (c == '.') {
        for (Node child : node.children) {               // her harfi dene
            if (child != null && dfs(word, i + 1, child)) return true;
        }
        return false;                                    // hiçbiri tutmadı
    }

    Node next = node.children[c - 'a'];                  // normal harf: tek yol
    return next != null && dfs(word, i + 1, next);
}
}
