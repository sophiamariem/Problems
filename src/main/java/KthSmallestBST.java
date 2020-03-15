import java.util.Stack;

public class KthSmallestBST {

    // O(n) time/space
    public int kthSmallest(BinaryTreeNode root, int k) {
        Stack<Integer> inOrder = new Stack();
        inOrderTraversal(root, inOrder, k);
        return inOrder.pop();
    }

    private void inOrderTraversal(BinaryTreeNode node, Stack<Integer> inOrder, int k) {
        if (node == null) {
            return;
        }

        inOrderTraversal(node.left, inOrder, k);
        if (inOrder.size() < k) {
            inOrder.push(node.value);
            inOrderTraversal(node.right, inOrder, k);
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
