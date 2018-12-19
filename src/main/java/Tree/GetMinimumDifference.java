package Tree;

public class GetMinimumDifference {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    int min = Integer.MAX_VALUE;
    int per = -1;

    public int getMinimumDifference(TreeNode root) {
        getMinimumDifferenceInternal(root);
        return min;
    }

    public void getMinimumDifferenceInternal(TreeNode node) {
        if (node == null)
            return;
        getMinimumDifferenceInternal(node.left);
        min = Math.min(min, (per != -1) ? Math.abs(node.val - per) : Integer.MAX_VALUE);
        per = node.val;
        getMinimumDifferenceInternal(node.right);
    }
}
