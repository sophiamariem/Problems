public class CousinsInBinaryTree {
    private TreeNode parentX = null;
    private TreeNode parentY = null;
    private int depthX = -1;
    private int depthY = -1;

    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root, x, y, null, 0);
        return parentX != parentY && depthX == depthY;
    }

    private void dfs(TreeNode node, int x, int y, TreeNode parent, int depth) {
        if (node == null) {
            return;
        }

        if (node.val == x) {
            parentX = parent;
            depthX = depth;
        }

        if (node.val == y) {
            parentY = parent;
            depthY = depth;
        }
        dfs(node.left, x, y, node, depth + 1);
        dfs(node.right, x, y, node, depth + 1);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
