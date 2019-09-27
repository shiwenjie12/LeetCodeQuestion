package Tree;

public class MinDepth {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int minDepth(TreeNode root) {
        if (root != null) {
            int left = minDepth(root.left);
            int right = minDepth(root.right);
            return (left != 0 && right != 0) ?
                    1 + Math.min(left, right) :
                    1 + left + right;
        } else {
            return 0;
        }
    }
}
