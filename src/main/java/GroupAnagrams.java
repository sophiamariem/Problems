import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList();
        Map<String, List<String>> map = new HashMap();

        for (int i = 0; i < strs.length; i++) {
            char[] strArr = strs[i].toCharArray();
            Arrays.sort(strArr);
            String key = new String(strArr);
            if (map.containsKey(key)) {
                map.get(key).add(strs[i]);
            } else {
                List<String> list = new ArrayList();
                list.add(strs[i]);

                result.add(list);
                map.put(key, list);
            }
        }
        return result;
    }
}
