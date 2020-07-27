import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ConstructBinaryTreeFromInorderPostorderTraversal {
    private int postIdx;
    private int[] postOrder;
    private Map<Integer, Integer> idxMap = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(inorder, postorder, 0, inorder.length - 1, postorder.length - 1);
    }

    public TreeNode helper(int[] in, int[] post, int inStart, int inEnd, int postEnd) {
        if (inStart > inEnd || postEnd < 0) {
            return null;
        }

        TreeNode root = new TreeNode(post[postEnd]);
        int current = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (in[i] == root.val) {
                current = i;
            }
        }

        root.left = helper(in, post, inStart, current - 1, postEnd - (inEnd - current + 1));
        root.right = helper(in, post, current + 1, inEnd, postEnd - 1);
        return root;
    }

    public TreeNode buildTreeAlt(int[] inorder, int[] postorder) {
        this.postOrder = postorder;
        this.postIdx = postorder.length - 1;

        int idx = 0;
        for (Integer val : inorder) {
            idxMap.put(val, idx++);
        }

        return helper(0, inorder.length - 1);
    }

    private TreeNode helper(int left, int right) {
        if (left > right) {
            return null;
        }

        TreeNode root = new TreeNode(postOrder[postIdx]);
        int midIdx = idxMap.get(root.val);

        postIdx--;

        root.right = helper(midIdx + 1, right);
        root.left = helper(left, midIdx - 1);
        return root;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
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

            ConstructBinaryTreeFromInorderPostorderTraversal.TreeNode other =
                    (ConstructBinaryTreeFromInorderPostorderTraversal.TreeNode) obj;
            return Objects.equals(val, other.val) &&
                    Objects.equals(this.left, other.left) &&
                    Objects.equals(this.right, other.right);
        }
    }
}
