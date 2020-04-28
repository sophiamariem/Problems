import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstUniqueNumber {

    private List<Integer> list = new ArrayList<>();
    private Map<Integer, Boolean> map = new HashMap();

    public FirstUniqueNumber(int[] nums) {
        for (int num : nums) {
            add(num);
        }
    }

    public int showFirstUnique() {
        for (int num : list) {
            if (map.get(num) == true) {
                return num;
            }
        }
        return -1;
    }

    public void add(int value) {
        if (map.containsKey(value)) {
            map.put(value, false);
        } else {
            map.put(value, true);
            list.add(value);
        }
    }
}
