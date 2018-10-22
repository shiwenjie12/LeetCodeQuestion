package Tree;

public class Tree2str {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public String tree2str(TreeNode t) {
        if (t == null) return "";
        StringBuilder sb = new StringBuilder();
        treeStr(t,sb);
        return sb.toString();
    }

    private void treeStr(TreeNode t, StringBuilder list){
        if (t == null) return;
        list.append(t.val);
        if (t.left == null && t.right == null){
            return;
        }
        list.append("(");
        treeStr(t.left,list);
        list.append(")");
        if (t.right != null){
            list.append("(");
            treeStr(t.right,list);
            list.append(")");
        }
    }
}
