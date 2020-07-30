import java.util.*;

public class WordBreakII {

    public List<String> wordBreak(String s, List<String> wordDict) {
        return dfs(s, wordDict, new HashMap<>());
    }

    private List<String> dfs(String s, List<String> wordDict, Map<String, List<String>> memo) {
        if (memo.containsKey(s)) {
            return memo.get(s);
        }

        List<String> result = new LinkedList<>();
        if (s.length() == 0) {
            result.add("");
        } else {
            for (String word : wordDict) {
                if (s.startsWith(word)) {
                    List<String> w = dfs(s.substring(word.length()), wordDict, memo);
                    for (String sub : w) {
                        result.add(word + (sub.isEmpty() ? "" : (" " + sub)));
                    }
                }
            }
        }
        memo.put(s, result);
        return result;
    }
}
