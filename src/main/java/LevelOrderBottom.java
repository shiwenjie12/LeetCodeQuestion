import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LevelOrderBottom {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Order(root,result,0);
        return result;
    }

    private void Order(TreeNode treeNode, List<List<Integer>> ALLlist,int index){
        if (treeNode == null) return;
        if (ALLlist.size() - 1 < index){
            ALLlist.add(0,new ArrayList<>());
        }
        Order(treeNode.left,ALLlist,index+ 1);
        Order(treeNode.right,ALLlist,index + 1);
        List<Integer> list = ALLlist.get(ALLlist.size() - index - 1);
        list.add(treeNode.val);
    }
}
