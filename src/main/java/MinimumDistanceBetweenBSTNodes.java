public class MinimumDistanceBetweenBSTNodes {
    private int min = Integer.MAX_VALUE;
    private Integer prev = null;

    public int minDiffInBST(TreeNode root) {
        inOrder(root);
        return min;
    }

    private void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        if (prev != null) {
            min = Math.min(min, root.val - prev);
        }

        prev = root.val;
        inOrder(root.right);
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
