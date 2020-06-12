import java.util.*;

// Insert Delete GetRandom O(1)
public class RandomizedSet {
    List<Integer> list;
    Map<Integer, Integer> values;
    Random rand;

    /**
     * Initialize your data structure here.
     */
    public RandomizedSet() {
        list = new ArrayList<>();
        values = new HashMap<>();
        rand = new Random();
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     */
    public boolean insert(int val) {
        if (values.containsKey(val)) {
            return false;
        }
        values.put(val, list.size());
        list.add(val);
        return true;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     */
    public boolean remove(int val) {
        if (!values.containsKey(val)) {
            return false;
        }

        int idx = values.get(val);
        int last = list.get(list.size() - 1);
        list.set(idx, last);
        list.remove(list.size() - 1);
        values.put(last, idx);
        values.remove(val);
        return true;
    }

    /**
     * Get a random element from the set.
     */
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}
