import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class CharFrequencySort {

    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();

        if (s == null || s.length() == 0) {
            return sb.toString();
        }

        Map<Character, Integer> mappedWithCount = new HashMap();
        for (char c : s.toCharArray()) {
//            mappedWithCount.putIfAbsent(c, 0);
//            mappedWithCount.put(c, mappedWithCount.get(c) + 1);
            mappedWithCount.put(c, mappedWithCount.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> queue = new PriorityQueue<>((a, b) -> {
            int result = mappedWithCount.get(b) - mappedWithCount.get(a);
            if (result == 0) {
                result = Character.compare(a, b);
            }
            return result;
        });

        for (char c : s.toCharArray()) {
            queue.add(c);
        }

        while (queue.size() > 0) {
            sb.append(queue.poll());
        }
        return sb.toString();
    }
}