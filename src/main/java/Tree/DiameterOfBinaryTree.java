package Tree;

public class DiameterOfBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    int dim = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return dim;
    }

    public int diameter(TreeNode treeNode) {
        if (treeNode == null)
            return 0;
        int l = diameter(treeNode.left);
        int r = diameter(treeNode.right);

        dim = Math.max(l + r, dim);
        return Math.max(l, r) + 1;
    }
}
