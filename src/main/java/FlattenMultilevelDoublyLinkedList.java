import java.util.Stack;

public class FlattenMultilevelDoublyLinkedList {

    public Node flatten(Node head) {
        helper(head);
        return head;
    }

    private Node helper(Node current) {
        Node last = current;
        while (current != null) {
            if (current.child == null) {
                last = current;
                current = current.next;
            } else {
                Node tail = helper(current.child);
                tail.next = current.next;
                if (current.next != null) {
                    current.next.prev = tail;
                }
                current.next = current.child;
                current.next.prev = current;
                current.child = null;
                last = tail;
                current = tail.next;
            }
        }
        return last;
    }

    public Node flattenWithStack(Node head) {
        Stack<Node> stack = new Stack<>();
        Node current = head;

        while (current != null) {
            if (current.child != null) {
                if (current.next != null) {
                    stack.push(current.next);
                }
                current.next = current.child;
                current.child.prev = current;
                current.child = null;
                current = current.next;
            } else if (current.next != null) {
                current = current.next;
            } else if (!stack.isEmpty()) {
                Node next = stack.pop();
                current.next = next;
                next.prev = current;
                current = next;
            } else {
                current = null;
            }
        }
        return head;
    }

    static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    }
}
