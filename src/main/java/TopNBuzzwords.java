import java.util.*;

public class TopNBuzzwords {
    private Map<String, WordCounts> mappedWithTotalCount = new HashMap();

//      numToys, an integer representing the number of toys
//      topToys, an integer representing the number of top toys your algorithm needs to return;
//      toys, a list of strings representing the toys,
//      numQuotes, an integer representing the number of quotes about toys;
//      quotes, a list of strings that consists of space-separated words representing articles about toys
//
//      The comparison of strings is case-insensitive. If the value of topToys is more than the number of toys
//      return the names of only the toys mentioned in the quotes
//      If toys are mentioned an equal number of times in quotes, return toy mentioned in most quotes.
//      If toys are mentioned an equal number of times in quotes and for an equal number of quotes, sort alphabetically.

    public List<String> topToys(int numToys, int topToys, String[] toys, int numQuotes, String[] quotes) {
        if (quotes == null || quotes.length == 0 || toys == null || toys.length == 0 || topToys == 0
                || numQuotes > quotes.length || numToys > numToys) {
            return Collections.emptyList();
        }

        Set<String> toySet = new HashSet<>();
        for (int i = 0; i < numToys; i++) {
            toySet.add(toys[i]);
        }

        for (int i = 0; i < quotes.length; i++) {
            String[] words = quotes[i].toLowerCase().split(" ");
            for (String word : words) {
                if (toySet.contains(word)) {
                    increaseCounts(i, word);
                }
            }
        }

        PriorityQueue<String> queue = new PriorityQueue<>((a, b) -> {
            int result = mappedWithTotalCount.get(b).count - mappedWithTotalCount.get(a).count;
            return result == 0 ? quoteCountAndLexicographicalCheck(a, b) : result;
        });

        for (String word : mappedWithTotalCount.keySet()) {
            queue.add(word);
        }

        return listWithTopToys(topToys, queue);
    }

    private void increaseCounts(int i, String word) {
        WordCounts wC = mappedWithTotalCount.containsKey(word) ? mappedWithTotalCount.get(word) : new WordCounts(0);
        wC.count++;
        wC.quoteIds.add(i);
        mappedWithTotalCount.put(word, wC);
    }

    private int quoteCountAndLexicographicalCheck(String a, String b) {
        int quoteSize = mappedWithTotalCount.get(b).quoteIds.size() - mappedWithTotalCount.get(a).quoteIds.size();
        return quoteSize == 0 ? -(b.compareTo(a)) : quoteSize;
    }

    private List<String> listWithTopToys(int topToys, PriorityQueue<String> queue) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < topToys) {
            if (queue.isEmpty()) {
                i = topToys;
            } else {
                list.add(queue.poll());
                i++;
            }
        }
        return list;
    }

    private static class WordCounts {
        private int count;
        private Set<Integer> quoteIds;

        private WordCounts(int count) {
            this.count = count;
            this.quoteIds = new HashSet<>();
        }
    }
}
