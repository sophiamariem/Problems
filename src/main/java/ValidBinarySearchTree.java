public class ValidBinarySearchTree {

    public boolean isBinarySearchTree(BinaryTreeNode root) {
        return isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBinarySearchTree(BinaryTreeNode root, int lowerBound, int upperBound) {
        if (root == null) {
            return true;
        }

        if (root.value >= upperBound || root.value <= lowerBound) {
            return false;
        }
        return isBinarySearchTree(root.left, lowerBound, root.value) && isBinarySearchTree(root.right, root.value, upperBound);
    }

    public static class BinaryTreeNode {
        private int value;
        private BinaryTreeNode left;
        private BinaryTreeNode right;

        public BinaryTreeNode(int value) {
            this.value = value;
        }

        public void insertLeft(BinaryTreeNode left) {
            this.left = left;
        }

        public void insertRight(BinaryTreeNode right) {
            this.right = right;
        }
    }
}
