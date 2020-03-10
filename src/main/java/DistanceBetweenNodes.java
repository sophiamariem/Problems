public class DistanceBetweenNodes {

    public int getDistanceBetween(TreeNode root, int node1, int node2) {
        if (root == null) {
            return -1;
        }

        TreeNode lowestCommonAncestor = lowestCommonAncestor(root, node1, node2);
        // also for binary trees can compute distance as so:
        // Dist(root, n1) + Dist(root, n2) - (2 * Dist(root, lca))
        return bstDistance(lowestCommonAncestor, node1) + bstDistance(lowestCommonAncestor, node2);
    }

    private TreeNode lowestCommonAncestor(TreeNode root, int node1, int node2) {
        // all left descendants <= n < all right descendants
        // simplified to: all left descendants < n < all right descendants
        while (true) {
            if (node1 < root.val && node2 < root.val) {
                root = root.left;
            } else if (root.val < node1 && root.val < node2) {
                root = root.right;
            } else {
                if (root.left == null && root.right == null) {
                    throw new IllegalArgumentException("Input not a BST");
                }
                return root;
            }
        }
    }

    private int bstDistance(TreeNode src, int dest) {
        if (src.val == dest) {
            return 0;
        }

        TreeNode node = src.left;
        if (src.val < dest) {
            node = src.right;
        }
        return bstDistance(node, dest) + 1;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
        }
    }
}
