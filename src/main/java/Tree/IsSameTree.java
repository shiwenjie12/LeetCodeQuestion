package Tree;

public class IsSameTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if ((p == null && q != null) || (q == null && p != null)) return false;
        if (p.val != q.val) return false;

        boolean left = isSameTree(p.left,q.left);
        if (left == false)
            return false;
        boolean right = isSameTree(p.right,q.right);
        if (right == false)
            return false;
        return true;
    }
}
