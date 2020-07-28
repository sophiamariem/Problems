import java.util.*;

public class TaskScheduler {

    public int leastInterval(char[] tasks, int n) {
        if (n == 0) {
            return tasks.length;
        }

        Map<Character, Integer> taskCount = new HashMap<>();
        for (char c : tasks) {
            taskCount.put(c, taskCount.getOrDefault(c, 0) + 1);
        }

        Queue<Integer> queue = new PriorityQueue<>((task1, task2) -> task2 - task1);
        for (char c : taskCount.keySet()) {
            queue.offer(taskCount.get(c));
        }

        int result = 0;
        Map<Integer, Integer> cooldown = new HashMap<>();
        while (!queue.isEmpty() || !cooldown.isEmpty()) {
            if (cooldown.containsKey(result - n - 1)) {
                queue.offer(cooldown.remove(result - n - 1));
            }
            if (!queue.isEmpty()) {
                int rem = queue.poll() - 1;
                if (rem != 0) {
                    cooldown.put(result, rem);
                }
            }
            result++;
        }

        return result;
    }

    public int leastIntervalF(char[] tasks, int n) {
        int[] frequencies = new int[26];
        for (char t : tasks) {
            frequencies[t - 'A']++;
        }
        Arrays.sort(frequencies);
        int maxFreq = frequencies[25];
        int idleTime = (maxFreq - 1) * n;
        for (int i = 24; i >= 0; --i) {
            if (idleTime <= 0) {
                break;
            }
            idleTime -= Math.min(frequencies[i], maxFreq - 1);
        }
        idleTime = Math.max(0, idleTime);
        return idleTime + tasks.length;
    }
}
