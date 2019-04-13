package BinarySearch;

public class MinDiffInBST {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private Integer perv = null;
    private int min = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        Calculate(root);
        return min;
    }

    public void Calculate(TreeNode node) {
        if (node == null) return;
        Calculate(node.left);
        if (perv == null) {
            perv = node.val;
        } else {
            min = Math.min(min, node.val - perv);
            perv = node.val;
        }
        Calculate(node.right);
    }
}
