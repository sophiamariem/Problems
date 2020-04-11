public class BinaryTreeDiameter {
    int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        length(root);
        return maxDiameter;
    }

    private int length(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = length(node.left);
        int right = length(node.right);

        maxDiameter = Math.max(maxDiameter, left + right);
        return Math.max(left, right) + 1;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
