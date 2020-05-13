import java.util.LinkedList;
import java.util.Stack;

public class RemoveKDigits {

    // 10 ms
    public String removeKdigitsStack(String num, int k) {
        if (k >= num.length()) {
            return "0";
        }

        Stack<Character> stack = new Stack<>();
        char[] input = num.toCharArray();
        int count = 0;

        for (char c : input) {
            while (!stack.isEmpty() && stack.peek() > c && count < k) {
                stack.pop();
                count++;
            }
            stack.push(c);
        }

        while (count < k) {
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }

        int numAfterZeroIdx = 0;
        while (numAfterZeroIdx < sb.length() && sb.charAt(numAfterZeroIdx) == '0') {
            numAfterZeroIdx++;
        }

        return numAfterZeroIdx == sb.length() ? "0" : sb.toString().substring(numAfterZeroIdx);
    }

    // 1 ms
    public String removeKdigitsPretendStack(String num, int k) {
        if (k >= num.length()) {
            return "0";
        }

        int length = num.length() - k;
        int top = -1;
        int start = 0;
        char[] input = num.toCharArray();

        for (int i = 0; i < input.length; i++) {
            while (top >= 0 && input[top] > input[i] && k > 0) {
                top--;
                k--;
            }
            input[++top] = input[i];
        }

        while (start <= top && input[start] == '0') {
            start++;
        }

        if (start > top) {
            return "0";
        }

        return new String(input, start, length - start);
    }

    // 0 ms
    public String removeKdigits(String num, int k) {
        int start = 0;
        int zeroIdx;

        while (true) {
            zeroIdx = num.indexOf('0', start);
            if (zeroIdx == -1 || k < zeroIdx - start) {
                break;
            } else {
                k -= zeroIdx - start;
            }

            start = zeroIdx;
            while (start < num.length() && num.charAt(start) == '0') {
                start++;
            }
        }

        if (start == num.length()) {
            return "0";
        }

        if (k == 0) {
            return num.substring(start);
        }


        if (zeroIdx == -1) {
            zeroIdx = num.length();
        }


        LinkedList<Character> chars = new LinkedList<>();
        chars.add(num.charAt(start));

        int deletedChar = 0;
        int i = start + 1;
        for (; deletedChar < k && i < zeroIdx; i++) {
            Character last = chars.peekLast();
            char c = num.charAt(i);
            while (!chars.isEmpty() && last > c && deletedChar < k) {
                deletedChar++;
                chars.pollLast();
                last = chars.peekLast();
            }
            chars.add(c);
        }

        while (deletedChar < k) {
            deletedChar++;
            chars.pollLast();
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (!chars.isEmpty()) {
            stringBuilder.append(chars.pollFirst());
        }
        stringBuilder.append(num.substring(i));

        return stringBuilder.length() == 0 ? stringBuilder.append(0).toString() : stringBuilder.toString();
    }
}
