import java.util.LinkedList;
import java.util.Queue;

public class StreamChecker {

    private TrieNode root;
    private TrieNode current;

    public StreamChecker(String[] words) {
        root = new TrieNode();

        for (String s : words) {
            add(s);
        }
        build();
        current = root;
    }

    public boolean query(char letter) {
        current = current.ch[letter - 'a'];
        return current.isEnd;
    }

    private void add(String s) {
        TrieNode c = root;
        for (int i = 0; i < s.length(); i++) {
            if (c.ch[s.charAt(i) - 'a'] == null) {
                c.ch[s.charAt(i) - 'a'] = new TrieNode();
            }
            c = c.ch[s.charAt(i) - 'a'];
        }
        c.setEnd();
    }

    private void build() {
        Queue<Pair> q = new LinkedList<>();
        for (int i = 0; i < 26; i++) {
            if (root.ch[i] == null) {
                root.ch[i] = root;
            } else {
                q.add(new Pair(root.ch[i], root));
            }
        }

        while (!q.isEmpty()) {
            Pair p = q.poll();
            TrieNode n1 = p.n1;
            TrieNode n2 = p.n2;
            for (int i = 0; i < 26; i++) {
                if (n1.ch[i] == null) {
                    n1.ch[i] = n2.ch[i];
                } else {
                    q.add(new Pair(n1.ch[i], n2.ch[i]));
                }
            }
            if (n2.isEnd) {
                n1.setEnd();
            }
        }
    }

    private class Pair {
        private TrieNode n1;
        private TrieNode n2;

        private Pair(TrieNode n1, TrieNode n2) {
            this.n1 = n1;
            this.n2 = n2;
        }
    }

    private class TrieNode {
        private TrieNode[] ch;
        private boolean isEnd;

        private TrieNode() {
            ch = new TrieNode[26];
        }

        private void setEnd() {
            isEnd = true;
        }
    }

}
