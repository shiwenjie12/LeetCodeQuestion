package Tree;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FindTarget {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    List<Integer> res = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        res.add(0);
        Inorder(root);
        if (res.size() == 0)
            return false;
        int i = 0, j = res.size() - 1;
        while ((i >= 0) && (j < res.size()) && (i < j)) {
            int sum = res.get(i) + res.get(j);
            System.out.println(res.get(i) + " + " + res.get(j) + " = " + sum);
            if (sum == k)
                return true;
            else if (sum < k)
                i++;
            else
                j--;
        }
        return false;
    }

    void Inorder(TreeNode root) {
        if (root == null)
            return;
        else {
            Inorder(root.left);
            res.add(root.val);
            Inorder(root.right);
        }
    }

    public static void main(String[] args) {
        //new FindTarget().findTarget()
    }
}
