import java.util.Objects;

public class BinarySearchTreeFromPreorderTraversal {

    public TreeNode bstFromPreorder(int[] preorder) {
        return convertToTreeNode(preorder, 0, preorder.length);
    }

    private TreeNode convertToTreeNode(int[] preorder, int start, int end) {
        if (start >= end) {
            return null;
        }
        int idx = start + 1;
        while (idx < end && preorder[idx] < preorder[start]) {
            idx++;
        }

        TreeNode node = new TreeNode(preorder[start]);
        node.left = convertToTreeNode(preorder, start + 1, idx);
        node.right = convertToTreeNode(preorder, idx, end);
        return node;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, left, right);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }

            if (obj == null || this.getClass() != obj.getClass()) {
                return false;
            }

            TreeNode other = (TreeNode) obj;
            return Objects.equals(val, other.val) &&
                    Objects.equals(this.left, other.left) &&
                    Objects.equals(this.right, other.right);
        }
    }
}
