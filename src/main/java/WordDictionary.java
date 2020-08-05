// . means it can represent any one letter
public class WordDictionary {

    // Sol 1
    public class Node {
        public Node[] nodes = new Node[26];
        public String word = "";
    }

    private Node root;

    /**
     * Initialize your data structure here.
     */
    public WordDictionary() {
        root = new Node();
        tnRoot = new TrieNode(null);
    }

    /**
     * Adds a word into the data structure.
     */
    public void addWord(String word) {
        Node node = root;
        for (char c : word.toCharArray()) {
            if (node.nodes[c - 'a'] == null) {
                node.nodes[c - 'a'] = new Node();
            }
            node = node.nodes[c - 'a'];
        }
        node.word = word;
    }

    /**
     * Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
     */
    public boolean search(String word) {
        return dfs(word.toCharArray(), 0, root);
    }

    private boolean dfs(char[] arr, int idx, Node node) {
        if (node == null) {
            return false;
        }
        if (idx == arr.length) {
            return !node.word.equals("");
        }
        if (arr[idx] == '.') {
            for (int i = 0; i < 26; i++) {
                if (dfs(arr, idx + 1, node.nodes[i])) {
                    return true;
                }
            }
        } else {
            return dfs(arr, idx + 1, node.nodes[arr[idx] - 'a']);
        }
        return false;
    }

    // Sol 2
    TrieNode tnRoot;

    /**
     * Adds a word into the data structure.
     */
    public void addWordTn(String word) {
        TrieNode current = tnRoot;
        for (int i = 0; i < word.length(); i++) {
            Character ch = word.charAt(i);
            TrieNode child = current.children[ch - 'a'];
            if (child == null) {
                child = new TrieNode(ch);
            }
            current.children[ch - 'a'] = child;
            current = child;
        }
        current.isEnd = true;
    }

    /**
     * Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
     */
    public boolean searchTn(String word) {
        return helper(tnRoot, word, 0);
    }

    private boolean helper(TrieNode current, String word, int index) {
        if (index == word.length()) {
            return current.isEnd ? true : false;
        }
        Character ch = word.charAt(index);
        if (ch == '.') {
            for (TrieNode child : current.children) {
                if (child != null && helper(child, word, index + 1)) {
                    return true;
                }
            }
            return false;
        } else {
            TrieNode child = current.children[ch - 'a'];
            if (child == null) {
                return false;
            } else {
                return helper(child, word, index + 1);
            }
        }

    }

    private class TrieNode {
        Character ch;
        TrieNode[] children;
        boolean isEnd;

        TrieNode(Character ch) {
            this.ch = ch;
            this.children = new TrieNode[26];
            this.isEnd = false;
        }

    }
}
