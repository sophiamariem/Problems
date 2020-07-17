import java.util.*;

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        Queue<Map.Entry<Integer, Integer>> minHeap =
                new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            minHeap.add(entry);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] result = new int[k];
        int i = 0;
        while (!minHeap.isEmpty()) {
            Map.Entry<Integer, Integer> entry = minHeap.poll();
            result[i] = entry.getKey();
            i++;
        }
        return result;
    }

    public int[] topKFrequentBucketSort(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length + 1];

        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        for (int n : count.keySet()) {
            int c = count.get(n);
            if (bucket[c] == null) {
                bucket[c] = new ArrayList<>();
            }
            bucket[c].add(n);
        }

        int i = 0;
        int[] result = new int[k];
        for (int j = bucket.length - 1; j >= 0; j--) {
            if (bucket[j] != null && i < k) {
                for (int n : bucket[j]) {
                    result[i] = n;
                    i++;
                }
            }
        }
        return result;
    }

    // quick select would work here too!
}
