package Tree;

public class LowestCommonAncestor {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val == q.val) return q;
        if (p.val < q.val)
            if (p.val <= root.val && q.val >= root.val) return root;
        if (q.val < p.val)
            if (q.val <= root.val && p.val >= root.val) return root;
        if (q.val < root.val)
            return lowestCommonAncestor(root.left,p ,q);
        if (q.val > root.val)
            return lowestCommonAncestor(root.right,p ,q);
        return root;
    }
}
