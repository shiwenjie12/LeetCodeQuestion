public class IsBalanced {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isBalanced(TreeNode root) {
        int result = maxDepth(root);
        return result == -1 ? false : true;
    }

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int leftd = maxDepth(root.left);
        int reightd = maxDepth(root.right);
        if (leftd == -1 || reightd == -1) return -1;
        if(Math.abs(leftd - reightd) > 1) return -1;
        int max = Math.max(leftd,reightd);
        return max+1;
    }
}
