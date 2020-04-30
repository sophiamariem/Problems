import java.util.Stack;

public class QueueTwoStacks {
    private Stack<Integer> in = new Stack();
    private Stack<Integer> out = new Stack();

    public void enqueue(int item) {
        in.push(item);
    }

    public int dequeue() {
        while (!in.isEmpty()) {
            out.push(in.pop());
        }
        return out.isEmpty() ? -1 : out.pop();
    }
}