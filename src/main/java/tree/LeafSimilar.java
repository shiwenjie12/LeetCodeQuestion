package tree;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilar {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> array1 = new ArrayList<>();
        List<Integer> array2 = new ArrayList<>();

        leafNode(root1,array1);
        leafNode(root2,array2);
        if (array1.size() != array2.size())
            return false;
        for (int i = 0; i < array1.size(); i++) {
            int a = array1.get(i);
            int b = array2.get(i);
            if (a != b){
                return false;
            }
        }
        return true;
    }

    private void leafNode(TreeNode node, List<Integer> list){
        if (node == null) return;
        if (node.left == null && node.right == null) {
            list.add(node.val);return;
        }
        if (node.left != null) leafNode(node.left,list);
        if (node.right != null) leafNode(node.right,list);
    }
}
