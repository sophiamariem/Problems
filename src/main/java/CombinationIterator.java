import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CombinationIterator {
    private Stack<Character> stack;
    private Map<Character, Integer> map;
    private String result = "";
    private String characters;
    private int combinationLength;

    public CombinationIterator(String characters, int combinationLength) {
        this.characters = characters;
        this.combinationLength = combinationLength;

        map = new HashMap();
        stack = new Stack();

        for (Character c : characters.toCharArray()) {
            stack.push(c);
            result += c;
            if (stack.size() == combinationLength) {
                break;
            }
        }

        int idx = 0;
        for (Character c : characters.toCharArray()) {
            map.put(c, idx++);
        }
    }

    public String next() {
        String current = result;

        int idx = characters.length() - 1;
        while (!stack.isEmpty() && map.get(stack.peek()) == idx) {
            stack.pop();
            idx--;
            result = result.substring(0, result.length() - 1);
        }
        if (stack.isEmpty()) {
            return current;
        }

        idx = map.get(stack.pop());
        result = result.substring(0, result.length() - 1);

        while (stack.size() != combinationLength) {
            Character temp = characters.charAt(++idx);
            result += temp;
            stack.push(temp);
        }

        return current;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

}
