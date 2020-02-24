import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MostCommonLetterInString {

    public Character mostOccuringChar(String word) {
        if (word == null || word.isEmpty()) {
            return null;
        }

        Map<Character, Integer> mappedWithCount = new HashMap<>();
        for (Character c : word.toCharArray()) {
            mappedWithCount.put(c, mappedWithCount.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> queue = new PriorityQueue<>((a, b) -> mappedWithCount.get(b) - mappedWithCount.get(a));

        for (Character c : mappedWithCount.keySet()) {
            queue.add(c);
        }

        return queue.poll();
    }

}
