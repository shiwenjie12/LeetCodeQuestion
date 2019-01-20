package Tree;

public class IsSubtree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null && t == null)
            return true;
        if (s == null || t == null) {
            return false;
        }
        return isSubtree2(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    public boolean isSubtree2(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null || t == null) {
            return false;
        }
        if (s.val == t.val)
            return isSubtree2(s.left, t.left) && isSubtree2(s.right, t.right);
        else
            return false;
    }
}
