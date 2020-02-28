import java.util.*;

public class TopKFrequent {

    public List<String> topKFrequent(String[] words, int k) {
        List<String> list = new ArrayList<>();

        if (words == null || words.length == 0) {
            return list;
        }

        Map<String, Integer> mappedWithCount = new HashMap();
        for (String w : words) {
            mappedWithCount.put(w, mappedWithCount.getOrDefault(w, 0) + 1);
        }

        PriorityQueue<String> queue = new PriorityQueue<>((a, b) -> {
            int result = mappedWithCount.get(b) - mappedWithCount.get(a);
            return (result == 0) ? (a.compareTo(b)) : result;
        });

        for (String word : mappedWithCount.keySet()) {
            queue.add(word);
        }

        for (int i = 0; i < k; i++) {
            list.add(queue.poll());
        }
        return list;
    }
}
