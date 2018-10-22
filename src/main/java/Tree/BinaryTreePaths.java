package Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root != null) searchBT(root,"",result);
        return result;
    }

    private void searchBT(TreeNode node,String path,List<String> result){
        if(node.left == null && node.right == null) result.add(path + node.val);
        if(node.left != null) searchBT(node.left,path + node.val + "->",result);
        if(node.right != null) searchBT(node.right,path + node.val + "->",result);
    }
}
