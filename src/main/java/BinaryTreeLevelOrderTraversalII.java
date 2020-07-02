import java.util.*;

public class BinaryTreeLevelOrderTraversalII {

    public List<List<Integer>> levelOrderBottomBfs(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        Deque<TreeNode> deque = new ArrayDeque();
        deque.add(root);

        List<List<Integer>> lists = new ArrayList<>();
        while (!deque.isEmpty()) {
            int size = deque.size();
            List<Integer> level = new ArrayList(size);
            while (size-- > 0) {
                TreeNode current = deque.remove();
                level.add(current.val);
                if (current.left != null) {
                    deque.add(current.left);
                }
                if (current.right != null) {
                    deque.add(current.right);
                }
            }
            lists.add(0, level);
        }
        return lists;
    }

    public List<List<Integer>> levelOrderBottomDfs(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        dfs(list, root, 0);
        return list;
    }

    private void dfs(List<List<Integer>> list, TreeNode root, int level) {
        if (root != null) {
            if (list.size() == level) {
                list.add(0, new ArrayList<>());
            }

            list.get(list.size() - level - 1).add(root.val);
            dfs(list, root.left, level + 1);
            dfs(list, root.right, level + 1);
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
