import java.util.ArrayList;
import java.util.List;

public class WordSearchII {
    public List<String> findWords(char[][] board, String[] words) {
        List<String> result = new ArrayList<>();
        TrieNode root = buildTrie(words);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                dfs(board, i, j, result, root);
            }
        }
        return result;
    }

    private void dfs(char[][] board, int i, int j, List<String> result, TrieNode node) {
        char c = board[i][j];
        if (c == '#' || node.next[c - 'a'] == null) {
            return;
        }

        node = node.next[c - 'a'];
        if (node.word != null) {
            result.add(node.word);
            node.word = null;
        }

        board[i][j] = '#';
        if (i > 0) {
            dfs(board, i - 1, j, result, node);
        }
        if (j > 0) {
            dfs(board, i, j - 1, result, node);
        }
        if (i < board.length - 1) {
            dfs(board, i + 1, j, result, node);
        }
        if (j < board[0].length - 1) {
            dfs(board, i, j + 1, result, node);
        }
        board[i][j] = c;
    }

    private TrieNode buildTrie(String[] words) {
        TrieNode root = new TrieNode();

        for (String w : words) {
            TrieNode node = root;

            for (char c : w.toCharArray()) {
                if (node.next[c - 'a'] == null) {
                    node.next[c - 'a'] = new TrieNode();
                }

                node = node.next[c - 'a'];
            }

            node.word = w;
        }

        return root;
    }

    private class TrieNode {
        private TrieNode[] next = new TrieNode[26];
        private String word;
    }
}
