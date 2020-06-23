//Tree is binary
public class CountCompleteTreeNodes {

    // binary recursion - calculate the right node first, if the right node is complete tree (even incomplete leaves)
    // the left node will surely be a complete tree with complete leaves
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int[] result = helper(root);
        return result[0];
    }

    private int[] helper(TreeNode curr) {
        int[] res = new int[3];
        int total = 1;
        int level = 1;
        int incompleteLeaves = 0;

        if (curr.right == null) {
            if (curr.left != null) {
                incompleteLeaves = 1;
                total += 1;
                level += 1;
            }
            res[0] = total;
            res[1] = incompleteLeaves;
            res[2] = level;
            return res;
        }

        int[] right = helper(curr.right);
        int numLeft = 1;
        if (right[1] == 1) {
            // if right has incomplete leaves, then left must have complete leaves
            incompleteLeaves = 1;
            for (int i = 0; i < right[2]; i++) {
                numLeft *= 2;
            }
            numLeft -= 1;
            level = right[2];
        } else {
            //right has complete leaves, unsure about left
            int[] left = helper(curr.left);
            numLeft = left[0];
            incompleteLeaves = left[1];
            level = left[2];    // left level is no less than right
        }

        res[0] = numLeft + right[0] + 1;
        res[1] = incompleteLeaves;
        res[2] = level + 1; // level of root is 1 higher than child

        return res;
    }

    // total count of left subtree nodes plus the root node is 2^h where h is the height of left sub tree
    // then add right subtree node count
    public int countNodesBitManipulation(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int hLeft = getHeight(root.left);
        int hRight = getHeight(root.right);

        return hLeft == hRight ? (1 << hLeft) + countNodes(root.right) : (1 << hRight) + countNodes(root.left);
    }

    private int getHeight(TreeNode root) {
        return root == null ? 0 : 1 + getHeight(root.left);
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
