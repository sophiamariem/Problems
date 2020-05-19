import java.util.Stack;

class StockSpanner {

    private Stack<int[]> stack;
    private int idx = 0;

    public StockSpanner() {
        stack = new Stack<>();
    }

    public int nextWithMonotonicStack(int price) {
        while (!stack.isEmpty() && stack.peek()[1] <= price) {
            stack.pop();
        }

        int result = stack.isEmpty() ? ++idx : ++idx - (stack.peek()[0]);
        stack.push(new int[]{idx, price});
        return result;
    }

    public int nextWithTailLength(int price) {
        int result = 1;
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            result += stack.pop()[1];
        }
        stack.push(new int[]{price, result});
        return result;
    }
}