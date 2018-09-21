public class MaxDepth {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int leftd = maxDepth(root.left);
        int reightd = maxDepth(root.right);
        int max = Math.max(leftd,reightd);
        return max+1;
    }
}
