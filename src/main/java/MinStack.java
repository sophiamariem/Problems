import java.util.Arrays;

// 3ms
public class MinStack {
    private int CAPACITY = 100;
    private int[] elements;
    private int size = 0;
    private int min = Integer.MAX_VALUE;

    public MinStack() {
        elements = new int[CAPACITY];
    }

    public void push(int x) {
        if (size == elements.length) {
            expandSize();
        }

        if (x < min) {
            min = x;
        }
        elements[size++] = x;
    }

    public void pop() {
        if (size == 0) {
            return;
        }

        int elem = elements[--size];
        elements[size] = 0;
        if (elem == min) {
            recalculateMin();
        }
    }

    public int top() {
        if (size == 0) {
            return 0;
        }

        return elements[size - 1];
    }

    public int getMin() {
        if (size == 0) {
            return 0;
        }
        return this.min;
    }

    private void expandSize() {
        int expandedSize = elements.length * 2;
        elements = Arrays.copyOf(elements, expandedSize);
    }

    private void recalculateMin() {
        this.min = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            this.min = Math.min(min, elements[i]);
        }
    }
}
