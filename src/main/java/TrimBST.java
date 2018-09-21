import com.sun.org.apache.bcel.internal.generic.RET;

public class TrimBST {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null)
            return null;
        if (root.val < L) return trimBST(root.right,L,R);
        if (root.val > R) return trimBST(root.left,L,R);

        root.left = trimBST(root.left,L,R);
        root.right = trimBST(root.right,L,R);
        return root;
    }
}
