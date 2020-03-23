import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Stack;

public class MaxRepeatedCharsForValue {

    // we assume as per the problem that this is a sorted string hence the reliance on stack as is
    public String returnStringWithMaxRepeatedFor(String input, int max) {
        StringBuilder sb = new StringBuilder();

        Stack<Character> charStack = new Stack<>();
        char[] chars = input.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            if (charStack.isEmpty() || charStack.peek() != chars[i]) {
                charStack.push(chars[i]);
            }
        }

        while (!charStack.isEmpty()) {
            char c = charStack.pop();
            for (int i = 0; i < max; i++) {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public String returnStringWithMaxRepeatedForWithSet(String input, int max) {
        StringBuilder sb = new StringBuilder();

        HashSet<Character> charSet = new HashSet<>();

        for (char c : input.toCharArray()) {
            charSet.add(c);
        }

        for (char c : charSet) {
            for (int i = 0; i < max; i++) {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    // or LinkedList
    public String returnStringWithMaxRepeatedForWithQueue(String input, int max) {
        StringBuilder sb = new StringBuilder();

        Queue<Character> charQueue = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            if (charQueue.isEmpty() || !charQueue.contains(c)) {
                charQueue.add(c);
            }
        }

        while (!charQueue.isEmpty()) {
            char c = charQueue.poll();
            for (int i = 0; i < max; i++) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
