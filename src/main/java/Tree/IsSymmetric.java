package Tree;

public class IsSymmetric {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);
    }

    public boolean isSymmetric(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if ((node1 != null && node2 == null) ||
                (node1 == null && node2 != null)) {
            return false;
        }
        if (node1.val == node2.val) {
            return isSymmetric(node1.left, node2.right)
                    && isSymmetric(node1.right, node2.left);
        } else {
            return false;
        }
    }
}
