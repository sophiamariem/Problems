public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        if (word == null || word.length() == 0) {
            return;
        }

        TrieNode cur = root;
        int n = word.length();
        for (int i = 0; i < n; i++) {
            char c = word.charAt(i);
            if (cur.children[c - 'a'] == null) {
                cur.children[c - 'a'] = new TrieNode();
            }
            cur = cur.children[c - 'a'];
        }
        cur.isWord = true;
    }

    public boolean search(String word) {
        return contains(word, true);
    }

    public boolean startsWith(String prefix) {
        return contains(prefix, false);
    }

    private boolean contains(String prefix, boolean exact) {
        TrieNode cur = root;
        if (prefix == null || prefix.length() == 0) {
            return false;
        }

        int n = prefix.length();
        for (int i = 0; i < n; i++) {
            char c = prefix.charAt(i);
            if (cur.children[c - 'a'] == null) {
                return false;
            }
            cur = cur.children[c - 'a'];
        }
        return exact ? cur.isWord : true;
    }

    private class TrieNode {
        private boolean isWord;
        private TrieNode[] children;

        private TrieNode() {
            isWord = false;
            children = new TrieNode[26];
        }
    }
}
