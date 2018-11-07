package Tree;

import java.util.ArrayList;
import java.util.List;

public class SumOfLeftLeaves {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) {return 0;}
        if(root.left!=null && root.left.left==null &&
                root.left.right==null) {
            sum += root.left.val;
        }
        sumOfLeftLeaves(root.left);
        sumOfLeftLeaves(root.right);
        return sum;
    }
}
