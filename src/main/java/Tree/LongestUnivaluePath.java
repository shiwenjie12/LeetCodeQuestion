package Tree;

public class LongestUnivaluePath {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private int maxl = 0;

    public int longestUnivaluePath(TreeNode root) {
        if (root == null)
            return 0;
        getMaxl(root, root.val);
        return maxl;
    }

    private int getMaxl(TreeNode node, int value) {
        if (node == null)
            return 0;
        int l = getMaxl(node.left, node.val);
        int r = getMaxl(node.right, node.val);
        maxl = Math.max(maxl, l + r);
        if (node.val == value)
            return Math.max(l, r) + 1;
        return 0;
    }
}
