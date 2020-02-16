import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ArrayToBST {

    public class Node {
        private Node left;
        private Node right;
        private int data;

        public Node(int data) {
            this.data = data;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        public int getData() {
            return data;
        }
    }

    public Node convertToBST(int[] arr) {
        if (arr == null) {
            return null;
        }

        Arrays.sort(arr);
        return convertToBST(arr, 0, arr.length - 1);
    }

    public void printTreeByLevel(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }

            System.out.print(current.data + " ");
        }
    }

    public void printTreeInOrder(Node root) {
        if (root == null) {
            return;
        }

        printTreeInOrder(root.left);
        System.out.print(root.data + " ");
        printTreeInOrder(root.right);
    }

    private Node convertToBST(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;

        Node root = new Node(arr[mid]);
        root.left = convertToBST(arr, start, mid - 1);
        root.right = convertToBST(arr, mid + 1, end);

        return root;
    }
}
