import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

// Search Suggestions System
public class ProductSuggestions {

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> result = new ArrayList<>();
        if (products == null) {
            return null;
        }

        // sort lexicographically as per problem instructions
        Arrays.sort(products);

        Trie trie = new Trie(products);
        TrieNode node = trie.root;

        boolean keepAdding = true;
        for (char character : searchWord.toCharArray()) {
            TrieNode charNode = node.children.get(character);
            if (keepAdding && charNode != null && charNode.words != null) {
                result.add(listOfWordsForChar(charNode));
                node = charNode;
            } else {
                result.add(Collections.emptyList());
                keepAdding = false;
            }
        }
        return result;
    }

    private List<String> listOfWordsForChar(TrieNode charNode) {
        List<String> listForChar = new ArrayList<>();

        for (String word : charNode.words) {
            listForChar.add(word);
            // problem asks for a max of 3 to be returned
            if (listForChar.size() == 3) {
                break;
            }
        }
        return listForChar;
    }

    private class TrieNode {
        private HashMap<Character, TrieNode> children;
        private List<String> words;

        private TrieNode() {
            this.children = new HashMap<>();
            this.words = new ArrayList<>();
        }
    }

    private class Trie {
        private TrieNode root;

        private Trie(String[] list) {
            this.root = new TrieNode();

            for (String word : list) {
                TrieNode current = root;

                for (char c : word.toCharArray()) {
                    if (current.children.get(c) == null) {
                        current.children.put(c, new TrieNode());
                    }
                    current = current.children.get(c);
                    current.words.add(word);
                }
            }
        }
    }

    public List<List<String>> suggestedProductsSimple(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> res = new ArrayList();
        int l = 0, r = products.length - 1;

        for (int i = 0; i < searchWord.length(); i++) {
            while (l <= r && (products[l].length() <= i || products[l].charAt(i) != searchWord.charAt(i))) {
                l++;
            }
            while (l <= r && (products[r].length() <= i || products[r].charAt(i) != searchWord.charAt(i))) {
                r--;
            }
            List<String> list = new ArrayList<>();
            int len = Math.min(l + 3, r + 1);
            for (int j = l; j < len; j++) {
                list.add(products[j]);
            }
            res.add(list);
        }

        return res;
    }
}
