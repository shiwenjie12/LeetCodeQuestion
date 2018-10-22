package Tree;

public class ConvertBST {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    int sum;

    public TreeNode convertBST(TreeNode root) {
        convert(root);
        return root;
    }

    private void convert(TreeNode node){
        if (node == null) return;
        convert(node.right);
        sum = sum + node.val;
        node.val = sum;
        convert(node.left);
    }
}
