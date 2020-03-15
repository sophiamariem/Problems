import java.util.Stack;

public class KthLargestBST {

    // O(n) time/space
    public int findKthLargest(BinaryTreeNode root, int k) {
        Stack<Integer> reversedInOrder = new Stack();
        reversedInOrderTraversal(root, reversedInOrder, k);
        return reversedInOrder.pop();
    }

    private void reversedInOrderTraversal(BinaryTreeNode node, Stack<Integer> inOrder, int k) {
        if (node == null) {
            return;
        }

        reversedInOrderTraversal(node.right, inOrder, k);
        if (inOrder.size() < k) {
            inOrder.push(node.value);
            reversedInOrderTraversal(node.left, inOrder, k);
        }
    }

    public static class BinaryTreeNode {
        private int value;
        private BinaryTreeNode left;
        private BinaryTreeNode right;

        public BinaryTreeNode(int value) {
            this.value = value;
        }

        public BinaryTreeNode insertLeft(int leftValue) {
            this.left = new BinaryTreeNode(leftValue);
            return this.left;
        }

        public BinaryTreeNode insertRight(int rightValue) {
            this.right = new BinaryTreeNode(rightValue);
            return this.right;
        }

        public int getValue() {
            return value;
        }
    }
}
