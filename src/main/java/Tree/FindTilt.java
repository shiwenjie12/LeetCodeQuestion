package Tree;

public class FindTilt {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    int sum = 0;
    public int findTilt(TreeNode root) {
        findSubTilt(root);
        return sum;
    }

    public int findSubTilt(TreeNode node) {
        if (node == null)
            return 0;
        int l = findSubTilt(node.left);
        int r = findSubTilt(node.right);
        sum += Math.abs(l - r);
        return l + r + node.val;
    }
}
