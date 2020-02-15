public class CircularQueue {
    private static int SIZE = 10;
    private int[] dataArray;
    private int front;
    private int rear;

    public CircularQueue() {
        dataArray = new int[SIZE];
        front = rear = -1;
    }

    public void enqueue(int data) {
        int c = (rear + 1) % dataArray.length;

        if (c != front) {
            rear = c;
            dataArray[rear] = data;

            if (front == -1) {
                front = 0;
            }
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            int frontVal = dataArray[front];

            if (front == rear) {
                front = rear = -1;
            } else {
                dataArray[front] = 0;
                front = (front + 1) % dataArray.length;
            }
            return frontVal;
        }
        return 0;
    }

    public int[] getDataArray() {
        return dataArray;
    }

    private boolean isEmpty() {
        return front == -1;
    }
}
