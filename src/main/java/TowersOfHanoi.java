import java.util.Stack;

public class TowersOfHanoi {
    private Stack<Integer> disks = new Stack<>();

    public void add(int d) {
        if (disks.isEmpty() || disks.peek() > d) {
            disks.push(d);
        }
    }

    public void moveDisks(int count, TowersOfHanoi buffer, TowersOfHanoi dest) {
        if (count > 0) {
            moveDisks(count - 1, dest, buffer);
            moveTop(dest);
            buffer.moveDisks(count - 1, this, dest);
        }
    }

    private void moveTop(TowersOfHanoi t) {
        int top = disks.pop();
        t.add(top);
    }

    public Stack<Integer> getDisks() {
        return disks;
    }
}
